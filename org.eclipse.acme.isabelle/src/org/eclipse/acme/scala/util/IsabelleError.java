package org.eclipse.acme.scala.util;

public class IsabelleError {
	String errorMsg;
	int line;
	int offset;
	int end_offset;
	
	public IsabelleError() {
		errorMsg = "";
		line = 0;
		offset = 0;
		end_offset = 0;
	}
	
	public void setErrorMsg(String msg_) {errorMsg = msg_;}
	public void setLine(int line_) {line = line_;}
	public void setOffset(int offset_) {offset = offset_;}
	public void setEndOffset(int end_offset_) {end_offset = end_offset_;}
	
	public String getErrorMsg() {return errorMsg;}
	public int getLine() {return line;}
	public int getOffset() {return offset;}
	public int getEndOffset() {return end_offset;}
}
