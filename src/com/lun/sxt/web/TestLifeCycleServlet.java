package com.lun.sxt.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestLifeCycleServlet extends HttpServlet {

    public TestLifeCycleServlet() {
        System.out.println("constructor");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("doGet");
    }
}
