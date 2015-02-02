package com.example.datastore.jdo;

import java.util.Collection;

import javax.jdo.PersistenceManager;

import com.example.datastore.dao.DAO;

public class JdoDAO<E> implements DAO<E> {
    
    private static PersistenceManager pm = PMF.get().getPersistenceManager();

    public static Object read(Object o, Object id) {
	return pm.getObjectById(o.getClass(), id);
    }

    @Override
    public boolean create(E t) {

	try {
	    pm.makePersistent(t);
	} finally {
	    pm.close();
	}
	return true;
    }

    @Override
    public E read(E t) {
	
	return null;
    }

    @Override
    public boolean update(E t) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean delete(E t) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public Collection<E> retrieveAll() {
	// TODO Auto-generated method stub
	return null;
    }

}
