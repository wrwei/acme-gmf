package org.eclipse.acme.scala.util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import IsabelleAPI.API;


/*
 * Usage: init() -> setTheoryFilepath() -> validate() -> getStatus() -> (optional) readErrors() -> shutdown()
 * 
 * */
public class IsabelleAgent {
	API api = new API();		// 
	String sessionID;			// sessionID
	String taskID;				// taskID
	String theoryFilepath;		// location of the theory file
	int nStatusID;				// status: 0: OK, n: have error (n = number of errors)
	
	ArrayList<IsabelleError> errorList = new ArrayList<>(); // array list contains all errors
	
	public IsabelleAgent() {
		sessionID = "";
		taskID = "";
		theoryFilepath = "";
		nStatusID = 0;
	}
	
	public void setDebugMode(boolean bSwitch) {
		if (bSwitch) {
			api.setDebugModeOn();
		}
		else {
			api.setDebugModeOff();
		}
	}
	
	public int getStatusID() {
		return nStatusID;
	}
	
	public void setTheoryFilepath(String theoryFilepath_) {
		theoryFilepath = theoryFilepath_;
		return;
	}

    public void init() {
        System.out.println("[ACME] The Isabelle server is starting!");
        api.server_start();
        api.app_start();
        System.out.println("[ACME] The Isabelle server and app have started!");
        return;
    }
     
    public void validate() throws Exception {
    	System.out.println("[ACME] The app is starting an HOL session!");
        api.session_start("HOL");
        api.read_msgs();
        
        System.out.println("[ACME] The app is loading theory into a session!");
        api.theories_validate(theoryFilepath);
        String jsonMsg = api.read_msgs();
        
        System.out.println(jsonMsg);
        jsonDecoding(jsonMsg);

    	return;
    }
    
    public void shutdown() {
        api.session_stop(); 
        api.server_shutdown(); 
        System.out.println("[ACME] Server is shutdown");
        return;
    }
    
    public int getStatus() {
    	return nStatusID;
	}
    
    public IsabelleError getError(int idx) {
    	return errorList.get(idx);
	}
    
    /* 
     * Json related functions: decoding the error message
     * 
     * */
    public void jsonDecoding(String jsonStr) throws Exception {
        errorList.clear();
        nStatusID = 0;
        
        // build a JSON object
        JSONObject obj = new JSONObject(jsonStr);
        
        JSONArray jsonErrors = obj.getJSONArray("errors");
        
        // iterates through the Json file
        for(int i = 0 ; i < jsonErrors.length() ; i++){
        	IsabelleError error = new IsabelleError();
        	error.errorMsg = jsonErrors.getJSONObject(i).getString("message");
            JSONObject obj_pos = jsonErrors.getJSONObject(i).getJSONObject("pos");
            
            error.line = obj_pos.getInt("line");
            error.offset = obj_pos.getInt("offset");
            error.end_offset = obj_pos.getInt("end_offset");
        
            errorList.add(error);
            
            System.out.println("[" + Integer.toString(i) + "]" + "(" + Integer.toString(error.line) + "," + 
            					Integer.toString(error.offset) + "," + Integer.toString(error.end_offset) + ")" + error.errorMsg);
            
            nStatusID++;
        }
        
        return;
    }
    
    /*
     * Isabelle server returns multiple entities of the same error, need to remove duplicates.
     * 
     * */
    public void removeDuplicatedErrors() {
    	return;
    }
}
