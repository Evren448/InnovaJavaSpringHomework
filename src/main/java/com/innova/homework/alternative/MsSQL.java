package com.innova.homework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MsSQL implements IDbStatus {
	
	@Override
	public String databaseVersion(String data) {
		return "Selected Database is MsSQL";
	}
	
}
