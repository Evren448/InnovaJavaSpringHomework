package com.innova.homework.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifierCDI")
@ApplicationScoped
public class ManagerDB {
	
	@Inject
	//@EQualifier(value = EDatabaseStatus.PostgreSQL)
	//@EQualifier(value = EDatabaseStatus.MsSQL)
	//@EQualifier(value = EDatabaseStatus.MariaDB)
	@Default
	private IDbStatus iDbStatus;
	
	public String getDatabaseVersion() {
		return iDbStatus.databaseVersion("Selected Database: ");
	}
	
}
