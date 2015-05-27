/**
 * 
 */
package com.empdir.dao.factory;

import com.empdir.dao.IEmployeeDao;
import com.empdir.dao.impl.EmployeeDao;

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
