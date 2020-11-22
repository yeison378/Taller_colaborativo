package model;

/**
 * @author yeison_Medina
 *
 */
public class Management {
	
	/**
	 * Texto inmutable con el que se va a trabajar
	 */
	private final String TEXT_STRING;
	
	/**
	 * @param TEXT_STRING texto inmodificable
	 */
	public Management (String TEXT_STRING) {
		this.TEXT_STRING = TEXT_STRING;
	}
	
	/**
	 * @return Nombre propio
	 */
	public String ownName() {
		ToolsForName toolsForname = new ToolsForName(TEXT_STRING);
		return toolsForname.result();
	}
	

	/**
	 * @param text texto a encriptar
	 * @return texto encriptado
	 */
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
	
	
	/**
	 * @param text texto encriptado
	 * @return texto desencriptado
	 */
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
