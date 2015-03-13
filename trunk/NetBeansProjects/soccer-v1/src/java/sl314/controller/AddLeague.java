/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.controller;

import com.soccer.leagues.Leagues;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sl314.model.League;

/**
 *
 * @author delpinof
 */
@WebServlet(name = "AddLeague", urlPatterns = {"/AddLeague"})
public class AddLeague extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Object year = request.getParameter("year");
        Object season = request.getParameter("season");
        Object title = request.getParameter("title");

        try {
            int n = Integer.parseInt(String.valueOf(year));
            String s = String.valueOf(season);
            String t = String.valueOf(title);

            List<League> leaguelist = Leagues.getInstance().getAllLeagues();
            League l = new League(n, s, t);
            leaguelist.add(l);
            request.setAttribute("leagueName", t);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } catch (Exception e) {
            List<String> errorList = Leagues.getInstance().getAllErrors();
            e.printStackTrace();
            errorList.add(e.getMessage() == null ? e.toString(): e.toString());
            request.setAttribute("errors", errorList);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
