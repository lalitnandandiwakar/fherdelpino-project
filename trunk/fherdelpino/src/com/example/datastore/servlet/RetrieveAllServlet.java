package com.example.datastore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entities;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Query;

public class RetrieveAllServlet extends HttpServlet {

    private static final long serialVersionUID = 6482870546905140758L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	execute(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	execute(req,resp);
    }
    
    private void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	PrintWriter writer = resp.getWriter();

	Query q = new Query(Entities.NAMESPACE_METADATA_KIND);

	for (Entity e : ds.prepare(q).asIterable()) {
	    // A nonzero numeric id denotes the default namespace;
	    // see <a href="#Namespace_Queries">Namespace Queries</a>, below
	    if (e.getKey().getId() != 0) {
		writer.println("<default>" + e.getKey().getId() + e.getKey().getName());
	    } else {
		writer.println(e.getKey().getName());
	    }
	}
    }

}
