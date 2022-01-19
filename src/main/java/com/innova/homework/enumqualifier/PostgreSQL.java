package com.innova.homework.enumqualifier;

@EQualifier(value = EDatabaseStatus.PostgreSQL)
public class PostgreSQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is PostgreSQL";
	}
	
}
