package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author yeison_Medina
 * @author Natalia Muñoz
 * @version 28/11/20
 */

//Clase Principal
public class Management {

	/**
	 * Texto inmutable con el que se va a trabajar
	 */
	private String TEXT_STRING;

	/**
	 * @param TEXT_STRING texto inmodificable
	 */
	public Management(String TEXT_STRING) {
		this.TEXT_STRING = TEXT_STRING;
	}

	/**
	 * Método para convertir en nombre propio el contenido de la cadena 
	 * @return Nombre propio
	 */
	public String ownName() {
		TextTools toolsForname = new TextTools(TEXT_STRING);
		return toolsForname.result();
	}

	/**
	 *  Método para buscar una palabra determinada y mostrar cuantas veces 
	 *  se encuentra dicha palabra en la cadena original.
	 *  @return cont;
	 */
	public int findWord(String word) {

		int cont = 0;
		String[] words = TEXT_STRING.split(" ");// en esta parte se separa la cadena de caracteres en palabras
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(word)) {
				cont++;
			}
		}
		return cont;
	}
	
	/**
	 * Metodo que encripta la cadena 
	 * @param text texto a encriptar
	 * @return texto encriptado
	 */
	public static String encrypt(String text) {
		String modifiedText = "";
		char character;
		int code = 0;
		for (int i = 0; i < text.length(); i++) {
			character = text.charAt(i);
			code = character + 7;
			character = (char) code;
			modifiedText += Character.toString(character);
		}
		return modifiedText;
	}

	/**
	 * Metodo que desencripta la cadena 
	 * @param text texto encriptado
	 * @return texto desencriptado
	 */
	public static String decrypt(String text) {
		String originalText = "";
		char character;
		int code = 0;
		for (int i = 0; i < text.length(); i++) {
			character = text.charAt(i);
			code = character - 7;
			character = (char) code;
			originalText += Character.toString(character);
		}
		return originalText;
	}

	/**
	 * Método para agregar un caracter n veces al inicio o fin de la cadena
	 * @param character
	 * @param limit
	 * @param address
	 * @return auxChain
	 */
	public String fillCharacters(char character, int limit, int address) {
		String chainModified = "";
		String auxChain = TEXT_STRING;
		for (int i = 0; i < limit; i++) {
			if (address == 1) {
				chainModified = character + auxChain;
			} else {
				chainModified = auxChain + character;
			}
			auxChain = chainModified;

		}
		return auxChain;
	}

    /**
     * Método para eliminar un determinado caracter en toda la cadena 
     * @param character
     * @return método fill(chain)
     */
	public String deleteCharacter(char character) {
		String[] chain = TEXT_STRING.split("");
		String characterString = String.valueOf(character);
		for (int i = 0; i < chain.length; i++) {
			if (chain[i].equalsIgnoreCase(characterString)) {
				chain[i] = "";
			}
		}
		return fill(chain);
	}
	
	/**
	 * Método de Interseccion
	 * @param text texto a comparar con texto principal(TEXT_STRING)
	 * @return cadena formada por las intersecciones entre la cadena de entrada y la
	 *         principal
	 */
	public String intersection(String text) {
		String intersectingText = "";
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < TEXT_STRING.length(); j++) {
				if (text.substring(i, i + 1).equalsIgnoreCase(TEXT_STRING.substring(j, j + 1))) {
					if (TextTools.identifyRepeatingData(text.substring(i, i + 1), intersectingText)) {
						intersectingText += TEXT_STRING.substring(j, j + 1);
					}
				}
			}
		}
		return intersectingText;
	}

	/**
	 * Método de Diferencia
	 * @param text texto a comparar con texto principal(TEXT_STRING)
	 * @return cadena formada por la diferencia entre cadenas
	 */
	public String difference(String text) {
		String modifiedText = TEXT_STRING;
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			result = modifiedText.replaceAll(text.substring(i, i + 1), "");
			modifiedText = result;
		}
		return result;
	}

	/**
	 * Método para comparar una palabra ingresada por consola con la cadena original
	 * e ir eliminando caracteres iguales.
	 * @param word
	 * @param address
	 * @return fill(chain)
	 */
	public String deleteComparing(String word, int address) {

		if (address == 1) {

			String[] chain = TEXT_STRING.split("");
			String[] characters = word.split("");
			for (int i = 0; i < chain.length; i++) {
				boolean repit = false;
				for (int j = 0; j < characters.length; j++) {
					if (chain[i].equalsIgnoreCase(characters[j])) {
						chain[i] = "";
						repit = true;
						break;
					}
				}
				if (repit == false) {
					break;
				}
			}
			return fill(chain);

		} else {
			String[] chain = TEXT_STRING.split("");
			String[] characters = word.split("");
			for (int i = chain.length - 1; i >= 0; i--) {
				boolean repit = false;
				for (int j = characters.length - 1; j >= 0; j--) {
					if (chain[i].equalsIgnoreCase(characters[j])) {
						chain[i] = "";
						repit = true;
						break;
					}
				}
				if (repit == false) {
					break;
				}
			}
			return fill(chain);

		}
	}

	/**
	 * Metodo para convertir un vector de la cadena de caracteres en un String
	 * @param chain
	 * @return result
	 */
	private String fill(String[] chain) {
		String result = new String();
		for (int i = 0; i < chain.length; i++) {
			result += chain[i];
		}
		return result;
	}
	
	/**
	 * Método para convertir a fecha
	 * @param date
	 * @return dateCalendar
	 * @return null
	 */
	public Date date(String date) {

		String[] dateArray = date.split("/");
		int day = Integer.valueOf(dateArray[0]);
		int month = Integer.valueOf(dateArray[1]) - 1;
		int year = Integer.valueOf(dateArray[2]);

		if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0 && dateArray[2].length() == 4) {
			Calendar dateCalendar = new GregorianCalendar(year, month, day);
			return dateCalendar.getTime();
		}
		return null;
	}

}