package com.nvz.gl309_1_2b_servletdemo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String user = "user";
            String userPassword = "123";
            String username = request.getParameter("myName");
            String password = request.getParameter("password");

            if (username.equals(user) & password.equals(userPassword)) {
                response.setContentType("text/html");
                PrintWriter pw = response.getWriter();
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                RequestDispatcher rd = request.getRequestDispatcher("/fail.jsp");
                rd.forward(request, response);
            }
        }
}
