package com.sonata.controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.sonata.Dao1.*;

import com.sonata.model.Customer;



/**
* Servlet implementation class CustomerServlet
*/
@WebServlet("/register")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private customerDao customerDao = new customerDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



   /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("customerdetails.jsp");
        dispatcher.forward(request, response);
        
        
    }



   /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
       
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
         Customer customer = new Customer();
            customer.setFirstname(firstName);
            customer.setLastname(lastName);
           
            customer.setAddress(address);
            customer.setContactno(contact);



           try {
                customerDao.registerCustomer(customer);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }



           RequestDispatcher dispatcher = request.getRequestDispatcher("customerregister.jsp");
            dispatcher.forward(request, response);
        }
    
    }