package com.neusoft.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author Eric Lee
 * @date 2020/8/25 16:47
 */
//@WebServlet("/demo3")
//@WebServlet(urlPatterns = "/demo3")
@WebServlet("/hehe")
public class SerletDemo implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service3.0厉害啊");
//        int a = 100;
//        int b = 1000;
//        int c = 0;
//        System.out.println(a + b);
//        System.out.println(a/c);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
