package com.lun.sxt.web;
import java.io.IOException;
public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doGet");
        response.getWriter().write("<a href=http://www.bjsxt.com>go</a>");
    }
}
