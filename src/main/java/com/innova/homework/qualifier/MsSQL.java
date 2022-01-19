package com.innova.homework.qualifier;


@MsSQLQualifier
public class MsSQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MsSQL";
	}
	
}
