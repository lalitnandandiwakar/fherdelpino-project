package com.example.datastore;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;

public class DataSoreTest {

	public static void main(String[] args) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();

		Key guestbookKey = KeyFactory.createKey("Guestbook", "default");
		// Run an ancestor query to ensure we see the most up-to-date
		// view of the Greetings belonging to the selected Guestbook.
		Query query = new Query("Greeting", guestbookKey).addSort("date",
				Query.SortDirection.DESCENDING);
		List<Entity> greetings = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(10000));

		for (Entity greeting : greetings) {
			System.out.println(greeting.getProperty("user"));
			System.out.println(greeting.getProperty("content"));
			System.out.println(greeting.getProperty("date"));

		}
	}

}
