/**
 * 
 */
package com.empdir.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.empdir.business.rest.EmpDirectoryRestService;

/**
 * @author sthatiparthi
 *
 */
public class EmpDirRestApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public EmpDirRestApplication() {
		singletons.add(EmpDirectoryRestService.getInstance());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
