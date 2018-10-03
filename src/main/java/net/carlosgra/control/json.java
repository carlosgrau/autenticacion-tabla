/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.carlosgra.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos
 */
public class json extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para sesiones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet json para sesiones</h1>");
            out.println("<h1><strong>INFORMACIÓN</strong></h1>");
            out.println("<h2> Protocolo -> "+request.getProtocol()+"</h2>");
            out.println("<h2>Host petición -> "+request.getRemoteHost()+"</h2>");
            out.println("<h2>Ip petición -> "+request.getRemoteAddr()+"</h2>");
            out.println("<h2>Parametro usuario -> "+request.getParameter("usuario")+"</h2>");
            out.println("<h2>Parametro password -> "+request.getParameter("password")+"</h2>");
            out.println("<h2>Puerto de salida ->"+request.getRemotePort()+"</h2>");
            out.println("<h2>Puerto de entrada -> "+request.getLocalPort()+"</h2>");
            out.println("<h2>Ip local -> "+request.getLocalAddr()+"</h2>");
            out.println("<h2>Nombre local -> "+request.getLocalName()+"</h2>");
            out.println("<h2>Tipo autenticacion -> "+request.getAuthType()+"</h2>");
            out.println("<h2>Cookies -> "+request.getCookies()+"</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
