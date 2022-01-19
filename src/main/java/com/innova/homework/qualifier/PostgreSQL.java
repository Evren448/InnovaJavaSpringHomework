package com.innova.homework.qualifier;


import javax.enterprise.inject.Default;

@Default
public class PostgreSQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is PostgreSQL";
	}
	
}
