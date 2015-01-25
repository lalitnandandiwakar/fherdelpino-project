package com.example.datastore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.NamespaceManager;

public class RetrieveAllServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6482870546905140758L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String namespace = NamespaceManager.get();
		PrintWriter out = resp.getWriter();
		out.print(namespace);
	}
	
	

}
