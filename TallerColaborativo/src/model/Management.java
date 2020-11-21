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
	

}
