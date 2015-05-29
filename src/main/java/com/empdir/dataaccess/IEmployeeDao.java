/**
 * 
 */
package com.empdir.dataaccess;

import java.util.List;

import com.empdir.business.entities.Employee;

/**
 * @author sthatiparthi
 *
 */
public interface IEmployeeDao {

	/**
	 * 
	 * @param emp
	 */
	public void saveEmployee(Employee emp);

	/**
	 * 
	 * @param emp
	 */
	public void updateEmployee(Employee emp);

	/**
	 * 
	 * @param emp
	 */
	public void deleteEmployee(Employee emp);

	/**
	 * 
	 * @param empList
	 */
	public void saveEmployeeList(List<Employee> empList);

	/**
	 * 
	 * @param empList
	 */
	public void updateEmployeeList(List<Employee> empList);

	/**
	 * 
	 * @param empList
	 */
	public void deleteEmployeeList(List<Employee> empList);

}
