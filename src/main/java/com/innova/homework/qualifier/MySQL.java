package com.innova.homework.qualifier;


@MySQLQualifier
public class MySQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MySQL";
	}
	
}
