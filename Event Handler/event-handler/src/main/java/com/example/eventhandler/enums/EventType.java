package com.example.eventhandler.enums;



public enum EventType {
	
	NEW_DEPOSIT,

    EDIT_NAME,
    
    EDIT_PHOTO,
    
    EDIT_CAPTION,
    
    EDIT_BIO;

	private String value;

	public String getValue() {
		return value;
	}

}
