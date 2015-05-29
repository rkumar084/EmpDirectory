/**
 * 
 */
package com.empdir.business;

import java.util.List;

import com.empdir.data.EmployeeData;

/**
 * @author sthatiparthi
 *
 */
public interface IEmployeeService {

	/**
	 * 
	 * @param empData
	 */
	public void saveEmployee(EmployeeData empData);

	/**
	 * 
	 * @param empData
	 */
	public void updateEmployee(EmployeeData empData);

	/**
	 * 
	 * @param empData
	 */
	public void deleteEmployee(EmployeeData empData);

	/**
	 * 
	 * @param empDataList
	 */
	public void saveEmployeeList(List<EmployeeData> empDataList);

	/**
	 * 
	 * @param empDataList
	 */
	public void updateEmployeeList(List<EmployeeData> empDataList);

	/**
	 * 
	 * @param empDataList
	 */
	public void deleteEmployeeList(List<EmployeeData> empDataList);
}
