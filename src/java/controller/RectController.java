/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Rect;

/**
 *
 * @author KiThuat 88
 */
public class RectController extends HttpServlet {

   

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
        int num = Integer.parseInt(request.getParameter("num"));
        ArrayList<Rect> r = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            Rect c = new Rect();
            c.setWidth(random.nextInt(101) + 50);
            c.setHeight(random.nextInt(51) + 50);
            c.setX(random.nextInt(500-2 * c.getWidth()) + c.getWidth());
            c.setY(random.nextInt(500-2 * c.getHeight()) + c.getHeight());
//            c.setRed(random.nextInt(251));
//            c.setGreen(random.nextInt(251));
//            c.setBlue(random.nextInt(251));
            r.add(c);
        }
        request.setAttribute("Rect", r);
        request.getRequestDispatcher("Rect.jsp").forward(request, response);
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
