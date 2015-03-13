/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.BeerExpert;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author delpinof
 */
@WebServlet(name = "BeerSelect", urlPatterns = {"/BeerSelect"})
public class BeerSelect extends HttpServlet {

    

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("Consejose de Selección de Cerveza<br>");
       String t = request.getParameter("color");
       out.println("<br> Tipo de cerveza obtenido: " + t);
       
       BeerExpert be = new BeerExpert();
       
       List<String> lista = be.getBrands(t);
       
       for(String tipo : lista) {
           out.println("<br>Cerveza " + tipo);
       }
       
       RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
       request.setAttribute("chelas", lista);
       rd.forward(request, response);
    }

    
}
