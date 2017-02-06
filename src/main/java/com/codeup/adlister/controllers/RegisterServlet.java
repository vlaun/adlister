package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request
                .getRequestDispatcher("/WEB-INF/users/register.jsp")
                .forward(request, response)
        ;
    }

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException, ServletException {
        // TODO: ensure the submitted information is valid

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (username != null && password != null && email != null
                && !username.isEmpty() && !password.isEmpty() && !email.isEmpty()) {

            User user = new User(
                    0,
                    username,
                    email,
                    password
            );

            Users users = DaoFactory.getUsersDao();
            users.insert(user);

            request.getSession().setAttribute("user", user); // automatic login

            response.sendRedirect("/profile");
        } else {
            doGet(request, response);
        }
    }
}