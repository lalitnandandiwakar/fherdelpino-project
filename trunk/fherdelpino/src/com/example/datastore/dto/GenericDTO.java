package com.example.datastore.dto;

import java.util.HashMap;
import java.util.Map;

public class GenericDTO {
	
	private String entityKind;
	private String kind;
	private String name;
	private Long id;
	private String parent;	
	private Map<String,String> properties;
	
	public GenericDTO(String kind,String name, Long id, String parent) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.parent = parent;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Map<String, String> getProperties() {
		if (properties == null)
			properties = new HashMap<String, String>();
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public String getEntityKind() {
		return entityKind;
	}

	public void setEntityKind(String entityKind) {
		this.entityKind = entityKind;
	}

}
