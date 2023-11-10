package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class MiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("¡Hola desde el Servlet!");
    }
}
