package model;

public class Management {
	private final String TEXT_STRING;
	public Management (String TEXT_STRING) {
		this.TEXT_STRING = TEXT_STRING;
	}
	
	public String ownName() {
		ToolsForName toolsForname = new ToolsForName(TEXT_STRING);
		return toolsForname.result();
	}
	
	public static String encrypt(String text) {
		String modifiedText="";
		char character;
		int code =0;
		for(int i=0; i<text.length();i++){
			character= text.charAt(i);
			code= character+7;
			character=(char)code;
			modifiedText+=Character.toString(character);
		}
		return modifiedText;
	}
	
	public static String decrypt(String text) {
		String originalText="";
		char character;
		int code =0;
		for(int i=0; i<text.length();i++){
			character= text.charAt(i);
			code= character-7;
			character=(char)code;
			originalText+=Character.toString(character);
		}
		return originalText;
	}
	

}
