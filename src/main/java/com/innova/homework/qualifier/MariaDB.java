package com.innova.homework.qualifier;

@MariaDBQualifier
public class MariaDB implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MariaDB";
	}
	
}
