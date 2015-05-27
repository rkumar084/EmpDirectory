/**
 * 
 */
package com.empdir.service.factory;

import com.empdir.service.IEmployeeService;
import com.empdir.service.impl.EmployeeService;


/**
 * @author sthatiparthi
 *
 */
public class EmpDirectoryService {
	
	private static IEmployeeService employeeService;
	
	public static IEmployeeService getEmployeeService() {
		return employeeService == null ? employeeService = new EmployeeService()
				: employeeService;
	}


}
