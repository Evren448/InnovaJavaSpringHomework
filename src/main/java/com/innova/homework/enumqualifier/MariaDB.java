package com.innova.homework.enumqualifier;

@EQualifier(value = EDatabaseStatus.MariaDB)
public class MariaDB implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MariaDB";
	}
	
}
