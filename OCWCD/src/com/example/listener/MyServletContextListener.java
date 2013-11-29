package com.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.example.model.BeerExpert;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {		
		System.out.println("The app is shutting down");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("The app is starting");		
		arg0.getServletContext().setAttribute("BeerExpert", new BeerExpert());
	}

}
