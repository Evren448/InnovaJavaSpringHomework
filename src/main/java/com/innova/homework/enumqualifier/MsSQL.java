package com.innova.homework.enumqualifier;

@EQualifier(value = EDatabaseStatus.MsSQL)
public class MsSQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MsSQL";
	}
	
}
