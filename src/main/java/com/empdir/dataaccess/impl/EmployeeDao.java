/**
 * 
 */
package com.empdir.dataaccess.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.empdir.business.entities.Employee;
import com.empdir.dataaccess.IEmployeeDao;

/**
 * @author sthatiparthi
 *
 */
public class EmployeeDao implements IEmployeeDao {

	@PersistenceContext(unitName = "empdir")
	EntityManager em;

	private static final Logger logger = Logger.getLogger(EmployeeDao.class);

	/**
	 * Saves the employee to the database.
	 */
	public void saveDistrict(Employee theEmployee) {

		logger.info("Start: Saving the districtdata to the database in saveDistrict() method.");
		try {
			em.persist(theEmployee);
		} catch (Exception excp) {
			excp.printStackTrace();
			logger.error("Could not commit the transaction of saving the district"
					+ "data to the database.Exception thrown.");
		}

		logger.info("End: Successfully saved the districtto the database in saveDistrict() method.");
	}

}
