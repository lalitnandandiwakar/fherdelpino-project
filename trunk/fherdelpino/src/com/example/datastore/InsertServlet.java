package com.example.datastore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.util.FrontEndConstants;

public class InsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7869737014823787069L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String kind = req.getParameter(FrontEndConstants.DATASTORE_KIND);
		String name = req.getParameter(FrontEndConstants.DATASTORE_NAME);
		String id = req.getParameter(FrontEndConstants.DATASTORE_ID);
		String parent = req.getParameter(FrontEndConstants.DATASTORE_PARENT);
		Map<String, String> properties = new HashMap<String, String>();

		int i = 1;
		while (req.getParameter(FrontEndConstants.DATASTORE_PROP_NAME + i) != null) {
			properties
					.put(req.getParameter(FrontEndConstants.DATASTORE_PROP_NAME
							+ i),
							req.getParameter(FrontEndConstants.DATASTORE_PROP_VALUE
									+ i));
			i++;
		}
		
		resp.sendRedirect("/_ah/admin/");

	}

}
