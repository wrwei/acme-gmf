package IsabelleAPI

import isabelle.Server
import isabelle.Server_Commands
import isabelle.SQLite

class API {
  val default_name = "isabelle";
  val connection = server_info.connection(); // retrieved from server_info. Containing connection info allowing the app to read from and/or write messages to Isabelle server.
  var finished = true;                       // retrieved from sever_info. used to check if Isabelle server is still processing the request.
  var session_start_b = false;               // used to diff the message FINISHED, which is an output of the request "session_start", from the message FINISHED, which is an output of the request "use_theories".
  var session_ID = "";                       // used to store session_ID;
  var debug_mode = false;

  /**
    start Isabelle server
  */
  def start_isa_server(
      server_name: String = default_name,
      existing_server: Boolean = false
  ): (isabelle.Server.Info, Option[Server]) = {
    Server.init(
      name = server_name,
      existing_server = false,
      log = isabelle.No_Logger
    )
  }

  def server_start = start_isa_server();  // starting server with default parameters.
  def app_start = start_isa_server(existing_server = true); // start app.
  def server_info = app_start._1;   // retrieving information, ie., connection details and server activity, from app.

  /**
    configure debug mode on/off
  */
  def setDebugModeOn() {
    debug_mode = true;
  }

  def setDebugModeOff() {
    debug_mode = false;
  }

  /**
    print to terminal (for debug only)
  */
  def writeln(msg: String) {
    if (debug_mode) {
      isabelle.Output.writeln(msg, stdout = true);
    }
  }

  /**
    A request to Isabelle server to sart a session
  */
  def session_start(session: String) {
    connection.write_message(
      "session_start {\"session\": \"" + session + "\"}"
    );
    session_start_b = true; // It means that the next argument of FINISHED is from the output of session_start
    finished = !server_info.active();
  }

  /**
    A request to Isabelle server to load a theory into a started session
  */
  def theories_validate(theory_path: String) {
    connection.write_message(
      "use_theories {\"session_id\":\"" + session_ID + "\", \"theories\": [\"" + theory_path + "\"]}"
    );
    session_start_b = false; // It means that the next argument of FINISHED is from the output of use_theories
    finished = !server_info.active();
  }

  /**
    A request to Isabelle server to sart a session
  */
  def session_stop() {
    connection.write_message("session_stop {\"session\": \"" + session_ID + "\"}");
  }

  /**
    shutdown a server
  */
  def server_shutdown {
    connection.write_message("shutdown");
  }

  /**
    Read messages coming from the server and extract informations
  */
  def read_msgs(): String = {
    var msg_json: String = "";
    while (!finished) { // The app is reading messages coming from Isabelle server
      writeln("[API] A new message received from Isabelle server:")
      connection.read_message() match {
        case None =>
          writeln(
            "[API] Finished reading messages from the Isabelle server..."
          )
        case Some("") =>
          writeln(
            "[API] Error: THIS SHOULD NEVER HAPPEN. Received an empty string from the server..."
            // throw exception
          )
        case Some(msg) =>
          // Print feedback messages from Isabelle server
          writeln(msg);
          // Decoding feedback messages coming from Isabelle server
          val (name, argument) = Server.Argument.split(msg);
          msg_json = argument;
          decode_name_message(name) match { // The case where the server replies with a message of type FINISHED
            case (Server.Reply.FINISHED) => { // Extracting information from a FINISHED message coming from Isabelle server
              {
                {
                  session_start_b match {
                    case true => {
                      get_session_id(argument, session_start_b) match {
                        case None =>
                          writeln(
                            "[API] Did not find the session_id within the messages received from the Isabelle server, related to session_start"
                          )
                        case Some(session_id) => {
                          writeln(
                            "[API] Found the session_id within the messages received from the Isabelle server, related to session_start"
                          );
                          session_ID = session_id.toString;
                          finished = true;
                        }
                      };
                    }
                    case false => {
                      Server.Argument.parse(argument) match {
                        case () =>
                          writeln(
                            "[API] Unknown format for the argument of FINISHED message."
                          )
                        case map: isabelle.XML.Elem =>
                          writeln(
                            "[API] XML format."
                          )
                        case map: isabelle.JSON.T => {
                          var errors = Nil: List[isabelle.JSON.T];
                          var nodes = Nil: List[isabelle.JSON.T];
                          writeln(
                            "[API] Processing arguments..."
                          );
                          isabelle.JSON.array(map, "nodes") match {
                            case None =>
                              writeln("[API] No arguments.")
                            case Some(Nil) =>
                              writeln("[API] No nodes.");
                            case Some(nod :: nods) => {
                              writeln("[API] Found nodes for the theory.");
                              //nodes = nod:nods;
                              writeln(nods.toString);
                              isabelle.JSON.value(nod, "messages") match {
                                case None =>
                                  writeln("[API] No arguments.");
                                case Some(s) => {
                                  writeln("[API] Found message for the node.");
                                }
                              }
                            }
                          };
                          writeln("[API] Processing theory errors.");
                          isabelle.JSON.array(map, "errors") match {
                            case None =>
                              writeln("[API] No arguments for theory errors.");
                            case Some(Nil) =>
                              writeln("[API] No errors for the theory.");
                            case Some(err :: errs) => {
                              writeln("[API] There are error(s) for the theory.");
                              errors = err :: errs;
                            }
                          }
                          finished = true;
                        }
                      }
                    }
                  }
                }
              }
            }
            // handle the OK message
            case (Server.Reply.OK) => {
              writeln("[API] Received a OK message!")
            }
            // handle the note message
            case (Server.Reply.NOTE) => {
              writeln("[API] Received a note message!")
            }
            // handle the failed case
            case (Server.Reply.FAILED) => {
              writeln("[API] Got a failed message!")
              finished = true;
            }
            // handle the error case
            case (Server.Reply.ERROR) => {
              writeln("[API] Got an error message!")
              finished = true;
            }
            // others
            case _ => {
              writeln("[API] Error: unexpected message not OK/NOTE/FINISHED/FAILED/ERROR")
            }
          }

        case _ => {
          writeln("[API] Any other case!"); finished = true;
        }
      }
    }
    return msg_json;
  }


  /**
    decoding the name of a message comming from Isabelle server
  */
  def decode_name_message(name: String): isabelle.Server.Reply.Value = {
    name match {
      // The case where the server replies with a message of type OK
      case (Server.Reply(Server.Reply.OK, _)) => Server.Reply.OK
      // The case where the server replies with a message of type NOTE
      case (Server.Reply(Server.Reply.NOTE, _)) => Server.Reply.NOTE
      // The case where the server replies with a message of type ERROR
      case (Server.Reply(Server.Reply.ERROR, _)) => Server.Reply.ERROR
      // The case where the server replies with a message of type FINISHED
      case (Server.Reply(Server.Reply.FINISHED, _)) => Server.Reply.FINISHED
      // The case where the server replies with a message of type FAILED
      case (Server.Reply(Server.Reply.FAILED, _)) => Server.Reply.FAILED
    }
  }

  /**
    get session id
  */
  def get_session_id(argument: String, session_start_b: Boolean): Option[isabelle.JSON.T] = {
    Server.Argument.parse(argument) match {
      case () => None
      case map: isabelle.XML.Elem => {
        writeln(
          "[API] Need to process XML messages."
        );
        None
      }
      case map: isabelle.JSON.T => {
        session_start_b match {
          case true => {
            writeln(
              "[API] Processing JSON messages."
            );
            isabelle.JSON.value(map, "session_id") match {
              case None => {
                writeln(
                  "[API] No session_id for the JSON message."
                );
                None
              }
              case Some(session_id) => Some(session_id)
            }
          }
          case false => {
            writeln(
              "[API] session_start_b is FALSE.",
            );
            None
          }
        }
      }
    }
  }
}
