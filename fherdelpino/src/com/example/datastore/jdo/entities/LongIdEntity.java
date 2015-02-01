package com.example.datastore.jdo.entities;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public abstract class LongIdEntity {

	/**
	 * Use this for objects without entity group parents whose IDs should be
	 * generated automatically by the datastore.
	 */
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

}
