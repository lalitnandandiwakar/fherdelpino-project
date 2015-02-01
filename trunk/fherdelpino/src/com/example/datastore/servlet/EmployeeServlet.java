package com.example.datastore.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.datastore.jdo.JdoDAO;
import com.example.datastore.jdo.PMF;
import com.example.datastore.jdo.entities.Employee;
import com.example.util.FrontEndConstants;

public class EmployeeServlet extends HttpServlet {

    /**
	 * 
	 */
    private static final long serialVersionUID = -7729432243058601832L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String firstName = req.getParameter(FrontEndConstants.DATASTORE_EMPLOYEE_FIRST_NAME);
	String lastName = req.getParameter(FrontEndConstants.DATASTORE_EMPLOYEE_LAST_NAME);
	String hireDate = req.getParameter(FrontEndConstants.DATASTORE_EMPLOYEE_HIRE_DATE);

	SimpleDateFormat formatter = new SimpleDateFormat("MM/d/yyyy h:m a");
	Date parsedDate = null;
	try {
	    parsedDate = formatter.parse(hireDate);
	} catch (ParseException e1) {
	    e1.printStackTrace();
	}

	Employee e = new Employee(firstName, lastName, parsedDate);

	JdoDAO<Employee> dao = new JdoDAO<Employee>();

	dao.create(e);

	super.doPost(req, resp);
    }
}
