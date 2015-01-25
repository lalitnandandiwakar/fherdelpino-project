package com.example.datastore.dao;

import java.util.Collection;

import com.example.datastore.dto.GenericDTO;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class GenericDAO implements DAO<GenericDTO> {

	@Override
	public boolean create(GenericDTO dto) {
		Key key = null;
		if (dto.getId() == null) {
			key = KeyFactory.createKey(dto.getKind(), dto.getName());
		} else if (dto.getName() == null || dto.getName().equals("")) {
			key = KeyFactory.createKey(dto.getKind(), dto.getId());
		} else {
			throw new RuntimeException("Id or name must be filled but not both");
		}

		Entity entity = new Entity(dto.getEntityKind(), key);
		for (String propKey : dto.getProperties().keySet())
			entity.setProperty(propKey, dto.getProperties().get(propKey));

		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		datastore.put(entity);
		return true;
	}

	@Override
	public GenericDTO read(GenericDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(GenericDTO t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(GenericDTO t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<GenericDTO> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
