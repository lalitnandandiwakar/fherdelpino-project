package com.example.datastore.jdo.entities;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public abstract class KeyIdEntity implements Persistable {

	/**
	 * The key value includes the key of the entity group parent (if any) and
	 * either the app-assigned string ID or the system-generated numeric ID. To
	 * create the object with an app-assigned string ID, you create the Key
	 * value with the ID and set the field to the value. To create the object
	 * with a system-assigned numeric ID, you leave the key field null.
	 */
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

}
