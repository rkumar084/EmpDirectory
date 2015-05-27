/**
 * 
 */
package com.empdir.service.rest;

import javax.ws.rs.Path;

import org.apache.log4j.Logger;

/**
 * @author sthatiparthi
 *
 */
@Path("/empdir")
public class EmpDirectoryRestService {

	private static final Logger logger = Logger
			.getLogger(EmpDirectoryRestService.class);

	public EmpDirectoryRestService() {
	}

	private static final EmpDirectoryRestService INSTANCE = new EmpDirectoryRestService();

	public static EmpDirectoryRestService getInstance() {
		return INSTANCE;
	}
}
