/**
 * 
 */
package com.empdir.business.impl;

import org.apache.log4j.Logger;

import com.empdir.business.IEmployeeService;
import com.empdir.business.entities.Employee;
import com.empdir.data.EmployeeData;
import com.empdir.dataaccess.IEmployeeDao;
import com.empdir.dataaccess.factory.EmpDirectoryDao;

/**
 * @author sthatiparthi
 *
 */
public class EmployeeService implements IEmployeeService {

	private static final Logger logger = Logger
			.getLogger(EmployeeService.class);

	@Override
	public void saveEmployee(EmployeeData empData) {

		logger.info("Start : EmployeeService saveEmployee() method.");
		// get the employee dao.
		IEmployeeDao dao = EmpDirectoryDao.getEmployeeDao();
		Employee emp = new Employee();
		emp.setName("abc");
		dao.saveEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService saveEmployee() method.");
	}
}
