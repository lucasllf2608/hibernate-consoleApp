package br.com.hibernateConsole.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("game");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		JpaUtil.entityManagerFactory = entityManagerFactory;
	}


}
