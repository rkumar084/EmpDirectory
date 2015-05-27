/**
 * 
 */
package com.empdir.dataaccess.impl;

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

	/**
	 * Saves the employee to the database.
	 */
	public void saveEmployee(Employee theEmployee) {

		logger.info("Start: Saving the districtdata to the database in saveDistrict() method.");
		try {
			EntityManager em = EntityManagerUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(theEmployee);
			em.getTransaction().commit();
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of saving the district"
					+ "data to the database.Exception thrown.");
		}

		logger.info("End: Successfully saved the districtto the database in saveDistrict() method.");
	}

}
