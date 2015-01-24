package com.example.jdo;

import javax.jdo.PersistenceManager;

public class DAO {
	
	public static void create(Object o) {
		PersistenceManager pm = PMF.get().getPersistenceManager();

        try {
            pm.makePersistent(o);
        } finally {
            pm.close();
        }
	}
	
	public static Object read(Object o, Object id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		return pm.getObjectById(o.getClass(), id);
	}

}
