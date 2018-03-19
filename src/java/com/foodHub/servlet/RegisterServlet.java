/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.servlet;

import com.foodHub.entities.Customer;
import com.foodHub.interfaceImpl.CustomerDAOImpl;
import com.foodHub.interfaces.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SNEHA
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"registerservlet.do"})
public class RegisterServlet extends HttpServlet {

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
        String customer_Fname= request.getParameter("customer_Fname");
        String customer_Lname= request.getParameter("customer_Lname");
        String customer_Address= request.getParameter("customer_Address");
        String customer_DOB= request.getParameter("customer_DOB");
         String customer_EmailID= request.getParameter("customer_EmailID");
        String customer_PhoneNo= request.getParameter("customer_PhoneNo");
        String customer_LoginID=request.getParameter("customer_LoginID");
        String customer_Password= request.getParameter("customer_Password");
            System.out.println(customer_Fname);
         CustomerDAO custDAO = new CustomerDAOImpl();
        int count = custDAO.addCustomer(new Customer(customer_Fname,customer_Lname,customer_Address,customer_DOB,customer_EmailID,customer_PhoneNo,customer_LoginID,customer_Password));
       RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("login.jsp");
            }
            else{
                out.println("error");
                rd = request.getRequestDispatcher("Home.jsp");
            }
            rd.forward(request,response);
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
