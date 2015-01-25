package com.example.guestbook;

import com.example.datastore.jdo.JdoDAO;
import com.example.datastore.jdo.PMF;
import com.example.datastore.jdo.entities.Greeting;
import com.example.util.Constants;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignGuestbookServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

	String guestbookName = req.getParameter("guestbookName");

	if (guestbookName.equals(Constants.GUESTBOOK_DEFAULT)) {
	    insertDataStore(req);
	    resp.sendRedirect("/guestbook/guestbook.jsp?guestbookName=" + guestbookName);
	} else if (guestbookName.equals(Constants.GUESTBOOK_JDO)) {
	    insertJDODataStore(req);
	    resp.sendRedirect("/guestbook/guestbookJDO.jsp?guestbookName=" + guestbookName);
	}
    }

    private void insertDataStore(HttpServletRequest req) {

	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();

	String guestbookName = req.getParameter("guestbookName");
	Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
	String content = req.getParameter("content");
	Date date = new Date();
	Entity greeting = new Entity("Greeting", guestbookKey);
	greeting.setProperty("user", user);
	greeting.setProperty("date", date);
	greeting.setProperty("content", content);

	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	datastore.put(greeting);

    }

    private void insertJDODataStore(HttpServletRequest req) {
	PersistenceManager pm = PMF.get().getPersistenceManager();

	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();

	Key key = KeyFactory.createKey(Greeting.class.getSimpleName(), user.getEmail());

	Greeting g = new Greeting(user, new Date(), req.getParameter("content"));
	g.setKey(key);
	JdoDAO<Greeting> greetingDAO = new JdoDAO<Greeting>();
	greetingDAO.create(g);

    }
}