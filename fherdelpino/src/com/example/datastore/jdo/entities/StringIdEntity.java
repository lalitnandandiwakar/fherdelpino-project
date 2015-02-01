package com.example.datastore.jdo.entities;

import javax.jdo.annotations.PrimaryKey;

public abstract class StringIdEntity implements Persistable{
	
	/**
	 * Use this for objects without entity group parents whose IDs should be
	 * provided by the application.
	 */
	@PrimaryKey
	private String name;

}
