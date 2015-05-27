/**
 * 
 */
package com.empdir.servlet;

import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @author sthatiparthi
 *
 */
public class StartUpServlet extends HttpServlet {

	private static Logger logger = Logger.getLogger(StartUpServlet.class);

	public void init() throws ServletException {
		super.init();

		try {
			logger.info("load on start up>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

			//DBUtils.createSessionFactory();

			logger.info("Hibernate session factory was created successfully>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
