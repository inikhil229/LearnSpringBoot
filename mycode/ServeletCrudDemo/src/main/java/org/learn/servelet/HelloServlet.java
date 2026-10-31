package org.learn.servelet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public HelloServlet(){
        System.out.println("hello servlet constructor called");
    }

    @Override
    public void init(){
        System.out.println("init method called");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setStatus(200);
        res.setContentType("text/plain");
        res.getWriter().write("do get method called");
    }

    @Override
    public void destroy(){
        System.out.println("destroy method called");
    }
}
