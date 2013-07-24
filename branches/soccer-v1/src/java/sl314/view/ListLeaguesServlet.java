/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.view;

import com.soccer.leagues.Leagues;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ListLeaguesServlet", urlPatterns = {"/list_leagues.view"})
public class ListLeaguesServlet extends HttpServlet {

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

        String userAgent = request.getHeader("User-Agent");
        boolean isIE = userAgent.startsWith("Mozilla/4.0");

        
        List<League> leaguelist = Leagues.getInstance().getAllLeagues();

        PrintWriter out = response.getWriter();

        if (isIE) {
            out.write("<ul>");
            for(League l : leaguelist) {
                out.write("<li>");
                out.write(l.getTitle());
                out.write("</li>");
            }
            out.write("</ul>");
        } else {
            out.write("<table>");
            for (League l : leaguelist) {
                out.print("<tr><td>");
                out.print(l.getTitle());
                out.print("</td></tr>");
            }
            out.write("</table>");
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
