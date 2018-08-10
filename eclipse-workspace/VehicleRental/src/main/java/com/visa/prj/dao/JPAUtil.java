package com.visa.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory emFactory;
	static {
		
		/*
		 * Read "meta-inf"/persistence.xml and find persistence units="PU"
		 * Create EMFactory using these details.
		 * Internally EmFactory  creates a pool of db connections using the info provided. 
		 */
		   emFactory = Persistence.createEntityManagerFactory("PU");  //pool of connections
	}
	public static EntityManager getEntityManager(){
		/*
		 * EMFactory pics a connection from pool and creates a EM which is a wrapper for DB connection.
		 */
		return emFactory.createEntityManager();  //single connection
	}
	public static void close(){
		emFactory.close();
	}
}

