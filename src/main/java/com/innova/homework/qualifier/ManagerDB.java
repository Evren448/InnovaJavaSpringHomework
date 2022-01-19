package com.innova.homework.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCDI")
@ApplicationScoped
public class ManagerDB {
	
	@Inject
	//@MsSQLQualifier
	//@MariaDBQualifier
	@MySQLQualifier
	private IDbStatus iDbStatus;
	
	public String getDatabaseVersion() {
		return iDbStatus.databaseVersion("Selected Database: ");
	}
	
}
