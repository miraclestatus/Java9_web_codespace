package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo1..........");
//        // 设置状态码是 302
//        resp.setStatus(302);
//        //  设置响应头loction
//        resp.setHeader("location", "/responseDemo2");

//        req.setAttribute("msg", "response_success");
//        resp.sendRedirect("/responseDemo2");
        resp.sendRedirect("http://www.baidu.com");

    }
    }
