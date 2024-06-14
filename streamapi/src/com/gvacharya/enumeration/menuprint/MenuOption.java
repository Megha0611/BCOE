package com.gvacharya.enumeration.menuprint;

public enum MenuOption {
	ADD(1,"Add Record"),
	UPDATE(2,"Update Record"),
	SELECT(3,"Select Record"),
	SELECT_ALL(4,"Select All Record"),
	DELETE(5,"Delete Record"),
	EXIT(0,"Exit The Program");
	
	private int serialNo;
	private String menuDescription;
	
	private MenuOption(int serialNo,String menuDescription) {
	this.serialNo=serialNo;
	this.menuDescription=menuDescription;
}


	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getMenuDescription() {
		return menuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
}
