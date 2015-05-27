/**
 * 
 */
package com.empdir.dataaccess.factory;

import com.empdir.dataaccess.IEmployeeDao;
import com.empdir.dataaccess.impl.EmployeeDao;

/**
 * @author sthatiparthi
 *
 */
public class EmpDirectoryDao {
	

	private static IEmployeeDao employeeDao;
	
	public static IEmployeeDao getEmployeeDao() {
		return employeeDao == null ? employeeDao = new EmployeeDao()
				: employeeDao;
	}

}
