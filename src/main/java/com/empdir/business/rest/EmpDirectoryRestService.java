/**
 * 
 */
package com.empdir.business.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.empdir.business.IEmployeeService;
import com.empdir.business.factory.EmpDirectoryService;
import com.empdir.data.EmployeeData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

	private static final Gson gson = new GsonBuilder().create();
	
	private static final EmpDirectoryRestService INSTANCE = new EmpDirectoryRestService();

	public static EmpDirectoryRestService getInstance() {
		return INSTANCE;
	}
	
	@POST
	@Path("/employee")
	@Consumes("application/json")
	@Produces("application/text")
	public String saveEmployee(String empJsonString) {

		logger.info("Start : EmpDirectoryRestService saveEmployee() method .");
		try {
			EmployeeData empData = gson.fromJson(empJsonString, EmployeeData.class);
			IEmployeeService empService = EmpDirectoryService.getEmployeeService();
			empService.saveEmployee(empData);
		} catch (Exception excp) {
			logger.error("Error while saving District Data");
			return excp.getMessage();
		}
		logger.info("End : EmpDirectoryRestService saveEmployee() method .");
		return "Employee Data Saved Successfully!";
	}
}
