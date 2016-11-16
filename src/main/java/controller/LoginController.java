package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 15.11.2016.
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("l.html");
       view.forward(request, response);
        System.out.println("asdfgh");
      //  response.getWriter().write("Ошибка");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.doPost(req, resp);
        RequestDispatcher view = req.getRequestDispatcher("l.html");
        view.forward(req, resp);
        System.out.println("asdfgh");
    }
}
