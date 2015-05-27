package com.empdir.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class EntityManagerUtil {

	private static Logger logger = Logger.getLogger(EntityManagerUtil.class);

	private static EntityManagerFactory SESSIONFACTORY = null;

	/**
	 * ThreadLocal variable which holds the Session for the current thread.
	 */
	private static final ThreadLocal<EntityManager> SESSION = new ThreadLocal<EntityManager>();

	/**
	 * Constructor for Hibernate Util.
	 */
	protected EntityManagerUtil() {
		super();
	}

	public static void init(String thePersistentUnit) {

		try {
			// Create the SessionFactory
			if (SESSIONFACTORY == null) {
				SESSIONFACTORY = Persistence
						.createEntityManagerFactory(thePersistentUnit);
			}
		} catch (final Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			logger.error("Initial SessionFactory creation failed.", ex);
			// throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * For getting Current Session.
	 * 
	 * @return Session
	 * 
	 */
	public static EntityManager getEntityManager() {
		EntityManager em = (EntityManager) SESSION.get();
		// Open a new Session, if this Thread has none yet
		if (em == null || !em.isOpen()) {
			em = SESSIONFACTORY.createEntityManager();
			SESSION.set(em);
		}
		return em;
	}

	/**
	 * Close the Current Session.
	 * 
	 */

	public static void closeSession() {
		logger.info("closing session");
		final EntityManager em = (EntityManager) SESSION.get();
		SESSION.set(null);
		if (em != null && em.isOpen())
			em.close();
	}
}
