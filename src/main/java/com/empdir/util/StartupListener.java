/**
 * 
 */
package com.empdir.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * @author sthatiparthi
 *
 */
public class StartupListener implements ServletContextListener {

	private static final Logger logger = Logger
			.getLogger(StartupListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent theServletContext) {
	}

	@Override
	public void contextInitialized(ServletContextEvent theServletContext) {
		logger.info("listener started");
		EmpDirServer.init("empdir");
	}
}
