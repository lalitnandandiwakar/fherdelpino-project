package com.example.datastore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.datastore.dao.GenericDAO;
import com.example.datastore.dto.GenericDTO;
import com.example.util.FrontEndConstants;

public class InsertServlet extends HttpServlet {

    /**
	 * 
	 */
    private static final long serialVersionUID = 7869737014823787069L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String entityKind = req.getParameter(FrontEndConstants.DATASTORE_ENTITY_KIND);
	String kind = req.getParameter(FrontEndConstants.DATASTORE_KIND);
	String name = req.getParameter(FrontEndConstants.DATASTORE_NAME);
	String idString = req.getParameter(FrontEndConstants.DATASTORE_ID);
	Long id = null;
	if (idString != null && !idString.isEmpty()) {
	    try {
		id = Long.parseLong(idString);
	    } catch (NumberFormatException nfe) {
		throw new RuntimeException("id must be numeric!");
	    }
	}

	String parent = req.getParameter(FrontEndConstants.DATASTORE_PARENT);
	Map<String, String> properties = new HashMap<String, String>();

	String propName;
	String propValue;

	int i = 1;
	while (req.getParameter(FrontEndConstants.DATASTORE_PROP_NAME + i) != null
		&& !req.getParameter(FrontEndConstants.DATASTORE_PROP_NAME + i).isEmpty()) {

	    propName = req.getParameter(FrontEndConstants.DATASTORE_PROP_NAME + i);
	    propValue = req.getParameter(FrontEndConstants.DATASTORE_PROP_VALUE + i);
	    properties.put(propName, propValue);
	    i++;
	}

	GenericDTO dto = new GenericDTO(kind, name, id, parent);
	dto.setEntityKind(entityKind);
	dto.setProperties(properties);

	GenericDAO dao = new GenericDAO();
	dao.create(dto);

	resp.sendRedirect("https://console.developers.google.com/project/fherdelpino/datastore/query");

    }
}
