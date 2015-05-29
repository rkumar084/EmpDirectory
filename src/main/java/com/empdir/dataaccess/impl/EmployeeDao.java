/**
 * 
 */
package com.empdir.dataaccess.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;

import com.empdir.business.entities.Employee;
import com.empdir.dataaccess.IEmployeeDao;
import com.empdir.util.EntityManagerUtil;

/**
 * @author sthatiparthi
 *
 */
public class EmployeeDao implements IEmployeeDao {

	private static final Logger logger = Logger.getLogger(EmployeeDao.class);

	private static final EntityManager em = EntityManagerUtil
			.getEntityManager();

	/**
	 * Saves the employee to the database.
	 */
	public void saveEmployee(Employee emp) {

		logger.info("Start: EmployeeDao saveEmployee() method.");
		try {
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of saving the employee"
					+ "data to the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao saveEmployee() method.");
	}

	/**
	 * Updates the employee to the database.
	 */
	public void updateEmployee(Employee emp) {

		logger.info("Start: EmployeeDao updateEmployee() method.");
		try {
			logger.info(" employee id : " + emp.getId());
			em.getTransaction().begin();
			em.merge(emp);
			em.getTransaction().commit();
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of updating the employee"
					+ "data to the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao updateEmployee() method.");
	}

	/**
	 * Deletes the employee from the database.
	 */
	public void deleteEmployee(Employee emp) {

		logger.info("Start: EmployeeDao deleteEmployee() method.");
		try {
			logger.info(" employee id : " + emp.getId());
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of deleting the employee"
					+ "data from the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao deleteEmployee() method.");
	}

	/**
	 * Saves the list of employees to the database.
	 */
	public void saveEmployeeList(List<Employee> empList) {

		logger.info("Start: EmployeeDao saveEmployeeList() method.");
		try {
			for (Employee emp : empList) {
				saveEmployee(emp);
			}
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of saving the list of employee"
					+ "data to the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao saveEmployeeList() method.");
	}

	/**
	 * Updates the list of employees to the database.
	 */
	public void updateEmployeeList(List<Employee> empList) {

		logger.info("Start: EmployeeDao updateEmployeeList() method.");
		try {
			for (Employee emp : empList) {
				logger.info(" employee id : " + emp.getId());
				updateEmployee(emp);
			}
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of updating the list of employee"
					+ "data to the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao updateEmployeeList() method.");
	}

	/**
	 * Deletes the list of employees from the database.
	 */
	public void deleteEmployeeList(List<Employee> empList) {

		logger.info("Start: EmployeeDao deleteEmployeeList() method.");
		try {
			for (Employee emp : empList) {
				logger.info(" employee id : " + emp.getId());
				deleteEmployee(emp);
			}
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of deleting the list of employee"
					+ "data to the database.Exception thrown.");
		}
		logger.info("End: EmployeeDao deleteEmployeeList() method.");
	}
}
