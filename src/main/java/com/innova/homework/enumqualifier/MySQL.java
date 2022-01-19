package com.innova.homework.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class MySQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MySQL";
	}
	
}
