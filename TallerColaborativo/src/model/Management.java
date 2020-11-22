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
		TextTools toolsForname = new TextTools(TEXT_STRING);
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


	/**
	 * @param text texto a comparar con texto principal(TEXT_STRING)
	 * @return cadena formada por las intersecciones entre la cadena de entrada y la principal
	 */
	public String intersection(String text) {
		String intersectingText = "";
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < TEXT_STRING.length(); j++) {
				if(text.substring(i, i+1).equalsIgnoreCase(TEXT_STRING.substring(j, j+1))) {
					if(TextTools.identifyRepeatingData(text.substring(i, i+1), intersectingText)) {
						intersectingText += TEXT_STRING.substring(j, j+1);
					}
				}
			}
		}
		return intersectingText;
	}
	
	/**
	 * @param text texto a comparar con texto principal(TEXT_STRING)
	 * @return cadena formada por la diferencia entre cadenas 
	 */
	public String difference(String text) {
		String modifiedText = TEXT_STRING;
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			result = modifiedText.replaceAll(text.substring(i, i+1), "");
			modifiedText = result;
		}
		return result;
	}
	

}
