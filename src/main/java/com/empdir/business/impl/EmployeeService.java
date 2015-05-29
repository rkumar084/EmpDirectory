/**
 * 
 */
package com.empdir.business.impl;

import java.util.List;

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

	// get the employee dao.
	private IEmployeeDao dao = EmpDirectoryDao.getEmployeeDao();

	/**
	 * 
	 */
	public void saveEmployee(EmployeeData empData) {

		logger.info("Start : EmployeeService saveEmployee() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.saveEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService saveEmployee() method.");
	}

	@Override
	public void updateEmployee(EmployeeData empData) {

		logger.info("Start : EmployeeService updateEmployee() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.updateEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService updateEmployee() method.");

	}

	@Override
	public void deleteEmployee(EmployeeData empData) {
		
		logger.info("Start : EmployeeService deleteEmployee() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.deleteEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService deleteEmployee() method.");

	}

	@Override
	public void saveEmployeeList(List<EmployeeData> empDataList) {
		
		logger.info("Start : EmployeeService saveEmployeeList() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.saveEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService saveEmployeeList() method.");

	}

	@Override
	public void updateEmployeeList(List<EmployeeData> empDataList) {
		
		logger.info("Start : EmployeeService updateEmployeeList() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.updateEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService updateEmployeeList() method.");

	}

	@Override
	public void deleteEmployeeList(List<EmployeeData> empDataList) {
		
		logger.info("Start : EmployeeService deleteEmployeeList() method.");
		Employee emp = new Employee();
		emp.setName("abc");
		dao.deleteEmployee(emp);
		// get the entity pojo.
		logger.info("End : EmployeeService deleteEmployeeList() method.");

	}

}
