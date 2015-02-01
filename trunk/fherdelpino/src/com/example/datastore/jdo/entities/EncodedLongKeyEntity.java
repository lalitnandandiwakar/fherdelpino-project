package com.example.datastore.jdo.entities;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public abstract class EncodedLongKeyEntity implements Persistable {

	/**
	 * Similar to Key, but the value is the encoded string form of the key.
	 * Encoded string keys allow you to write your application in a portable
	 * manner and still take advantage of App Engine datastore entity groups.
	 */
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	@Extension(vendorName = "datanucleus", key = "gae.encoded-pk", value = "true")
	private String encodedKey;

	/**
	 * A "gae.pk-id" field is populated when the object is saved, and cannot be
	 * modified. Its type must be Long.
	 */
	@Persistent
	@Extension(vendorName = "datanucleus", key = "gae.pk-id", value = "true")
	private Long keyId;

}
