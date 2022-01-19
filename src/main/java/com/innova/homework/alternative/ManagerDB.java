package com.innova.homework.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class ManagerDB {
	
	@Inject
	private IDbStatus iDbStatus;
	
	public String getDatabaseVersion() {
		return iDbStatus.databaseVersion("Selected Database: ");
	}
	
}
