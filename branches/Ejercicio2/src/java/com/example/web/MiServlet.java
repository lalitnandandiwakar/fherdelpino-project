/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author delpinof
 */
@WebServlet(name = "MiServlet", urlPatterns = {"/MiServlet"})
public class MiServlet extends HttpServlet {

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
        out.write("<link rel=stylesheet type=text/css href=estilo.css>");
        out.write("<table ><tr class=\"colortr\">"
                + "<td><h3> Nombre </h3></td>"
                + "<td><h3> Apellido </h3></td>"
                + "<td><h3> Fecha de nacimiento </h3></td>"
                + "<td><h3> Edad </h3></td>"
                + "</tr><tr>");

        out.write("<td>" + request.getParameter("nombre") + "</td>");
        out.write("<td>" + request.getParameter("apellido") + "</td>");
        out.write("<td>" + request.getParameter("fecha") + "</td>");
        out.write("<td>" + request.getParameter("edad") + "</td>");

        out.write("</tr></table>");
    }
}
