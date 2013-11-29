package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */

public class BeerSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BeerSelectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String c = request.getParameter("color");
//		String size = request.getParameter("size");
		BeerExpert be = (BeerExpert)getServletContext().getAttribute("BeerExpert"); //Inserted by the ServletContextListener
		List<String> result = be.getBrands(c);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("BeerSelectResult.jsp");
		view.forward(request, response);
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Print selection advise <BR>");		
//		for (String s : result)
//			out.print("<br>try: " + s);

	}
}
