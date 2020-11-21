package model;

public class Management {
	private final String TEXT_STRING;
	
	public Management (String TEXT_STRING) {
		this.TEXT_STRING = TEXT_STRING;
	}
	
	public String ownName() {
//		System.out.println(ToolsForName.convert("hola"));
		ToolsForName toolsForname = new ToolsForName(TEXT_STRING);
		return toolsForname.result();
	}
	

}
