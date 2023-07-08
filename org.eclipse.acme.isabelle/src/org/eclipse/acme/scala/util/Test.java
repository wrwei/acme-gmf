package org.eclipse.acme.scala.util;

import org.eclipse.acme.scala.util.IsabelleError;

public class Test {
    public static void main(String[] args) {
    	IsabelleAgent agent = new IsabelleAgent();
    	
    	
    	// String testJson = "{\"ok\":false,\"errors\":[{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: command expected,\\nbut identifier ddsatatype\\\\<^here> was found\",\"pos\":{\"line\":7,\"offset\":89,\"end_offset\":95,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"fun\\\"\",\"pos\":{\"line\":13,\"offset\":165,\"end_offset\":168,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"fun\\\"\",\"pos\":{\"line\":18,\"offset\":278,\"end_offset\":281,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":23,\"offset\":401,\"end_offset\":406,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":24,\"offset\":442,\"end_offset\":444,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":26,\"offset\":467,\"end_offset\":472,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":27,\"offset\":533,\"end_offset\":535,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":29,\"offset\":558,\"end_offset\":563,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":30,\"offset\":636,\"end_offset\":638,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":32,\"offset\":690,\"end_offset\":695,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":33,\"offset\":743,\"end_offset\":745,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"end\\\"\",\"pos\":{\"line\":35,\"offset\":788,\"end_offset\":791,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}}],\"nodes\":[{\"messages\":[{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: command expected,\\nbut identifier ddsatatype\\\\<^here> was found\",\"pos\":{\"line\":7,\"offset\":89,\"end_offset\":95,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"fun\\\"\",\"pos\":{\"line\":13,\"offset\":165,\"end_offset\":168,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"fun\\\"\",\"pos\":{\"line\":18,\"offset\":278,\"end_offset\":281,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":23,\"offset\":401,\"end_offset\":406,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":24,\"offset\":442,\"end_offset\":444,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":26,\"offset\":467,\"end_offset\":472,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":27,\"offset\":533,\"end_offset\":535,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":29,\"offset\":558,\"end_offset\":563,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":30,\"offset\":636,\"end_offset\":638,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"lemma\\\"\",\"pos\":{\"line\":32,\"offset\":690,\"end_offset\":695,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"by\\\"\",\"pos\":{\"line\":33,\"offset\":743,\"end_offset\":745,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}},{\"kind\":\"error\",\"message\":\"Outer syntax error\\\\<^here>: missing theory context for command \\\"end\\\"\",\"pos\":{\"line\":35,\"offset\":788,\"end_offset\":791,\"file\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\"}}],\"theory_name\":\"Draft.Seq\",\"node_name\":\"/cygdrive/d/Tools/Isabelle2019/src/HOL/ex/Seq.thy\",\"exports\":[],\"status\":{\"percentage\":99,\"unprocessed\":0,\"running\":0,\"finished\":15,\"failed\":12,\"total\":27,\"consolidated\":false,\"canceled\":false,\"ok\":false,\"warned\":0}}],\"task\":\"73e94fc0-9756-4916-948c-c628dde82f79\"}";
    	
        try {
        	agent.setDebugMode(true);
        	agent.init();
        	agent.setTheoryFilepath("~~/src/HOL/ex/Seq");
        	
        	try {
        		agent.validate();
        		
        		int nStatus = agent.getStatus();
        		
        		// print error messages
        		for (int i = 0; i < nStatus; i++) {
        			IsabelleError error = agent.getError(i);
        			System.out.println(error.getErrorMsg());
        		}
        		
        	} catch (Exception e) {
    			// TODO: handle exception
    		}
        			
        	agent.shutdown();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    	return;
    	
    }
}
