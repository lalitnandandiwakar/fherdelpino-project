package com.example.datastore.dao;

import java.util.Collection;

public interface DAO<T> {
	
	public boolean create(T t);
	
	public T read(T t);
	
	public boolean update(T t);
	
	public boolean delete(T t);
	
	public Collection<T> retrieveAll();	

}
