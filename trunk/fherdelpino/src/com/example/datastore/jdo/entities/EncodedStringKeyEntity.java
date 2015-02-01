package com.example.datastore.jdo.entities;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public abstract class EncodedStringKeyEntity implements Persistable {

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
	 * A "gae.pk-name" field can be set to a key name prior to saving the
	 * object. When the object is saved, the encoded key field is populated with
	 * the complete key that includes the key name. Its type must be String.
	 */
	@Persistent
	@Extension(vendorName = "datanucleus", key = "gae.pk-name", value = "true")
	private String keyName;

}
