package model;

import java.util.ArrayList;

public class ToolsForName {

	private ArrayList<String> originalText;
	private ArrayList<String> modifiedText;
	private String text;

	public ToolsForName(String text) {
		this.text = text;
		originalText = new ArrayList<>();
		modifiedText = new ArrayList<>();	
	}
	
	public void words() {
		String cutWords= text+" ";
		String aux = "";
		for (int i = 0; i <cutWords.length(); i++) {
			if (!cutWords.substring(i, i + 1).equalsIgnoreCase(" ")) {
				aux += cutWords.substring(i, i + 1);
			}else {
				if(!aux.equalsIgnoreCase(""))originalText.add(aux);
				if(!aux.equalsIgnoreCase(""))modifiedText.add(aux);
				aux="";
			}
		}
	}
	
	public void substitution() {
		for(int i=0;i<modifiedText.size();i++) {
			modifiedText.set(i, addCapitalLetter(modifiedText.get(i)));
		}
	}
	
	public String addCapitalLetter(String word) {
		if(word.length()>1) {
			String firstLetter = word.substring(0, 1).toUpperCase();
			String nextLetters = word.substring(1, word.length());
			return firstLetter+nextLetters;
		}else {
			return word;
		}
	}
	
	public String result() {
		words();
		substitution();
		String string= text;
		for (int i = 0; i <modifiedText.size(); i++) {
			string = string.replaceAll(originalText.get(i), modifiedText.get(i));
		}
		return string;
	}

}
