package com.empdir.util;

import org.apache.log4j.Logger;

public class EmpDirServer {

	private static Logger logger = Logger.getLogger(EmpDirServer.class);

	private static boolean intialized = false;

	private EmpDirServer() {
		if (!intialized) {
			init("empdir");
		}
	}

	public static void init(String thePersistentUnit) {
		logger.info("Emp Directory Server going to be Intialized ..");
		EntityManagerUtil.init(thePersistentUnit);
		intialized = true;
		logger.info("Emp Directory Server is Intialized ..");
	}
}
