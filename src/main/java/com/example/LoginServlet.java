package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtiene los parámetros del formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Lógica de validación (puedes personalizar esto según tus necesidades)
        boolean isValidUser = validateUser(username, password);

        // Redirige a una página según el resultado de la validación
        if (isValidUser) {
            response.sendRedirect("welcome.jsp?username=" + username);
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    private boolean validateUser(String username, String password) {
        // Aquí puedes realizar la lógica de validación de usuario.
        // En un caso práctico, podrías verificar en una base de datos o
        // algún otro sistema de autenticación.
        // Por ahora, usaremos una validación simple para demostración.
        return "admin".equals(username) && "admin123".equals(password);
    }
}
