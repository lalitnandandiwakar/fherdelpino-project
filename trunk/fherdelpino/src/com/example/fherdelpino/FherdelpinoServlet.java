package com.example.fherdelpino;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.*;

import com.example.entities.Greeting;
import com.example.jdo.PMF;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class FherdelpinoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();

		Key guestbookKey = KeyFactory.createKey("Guestbook", "default");
		// Run an ancestor query to ensure we see the most up-to-date
		// view of the Greetings belonging to the selected Guestbook.
		Query query = new Query("Greeting", guestbookKey).addSort("date",
				Query.SortDirection.DESCENDING);
		List<Entity> greetings = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(10000));	

//		for (Entity greeting : greetings) {
//			System.out.println(greeting.getProperty("user"));
//			System.out.println(greeting.getProperty("content"));
//			System.out.println(greeting.getProperty("date"));
//
//		}
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Key k = KeyFactory.createKey(Greeting.class.getSimpleName(), "test@example.com");
		
		Object o = pm.getObjectsById(guestbookKey,4573968371548160l);
		
//		for(Object o : list) {
//			System.out.println( o);
//		}
	}
}
