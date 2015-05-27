/**
 * 
 */
package com.empdir.business.factory;

import com.empdir.business.IEmployeeService;
import com.empdir.business.impl.EmployeeService;


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
