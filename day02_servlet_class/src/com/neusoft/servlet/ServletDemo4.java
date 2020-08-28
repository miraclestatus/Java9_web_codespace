package com.neusoft.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author Eric Lee
 * @date 2020/8/26 11:03
 */
//servlet配置路径
//@WebServlet("/demo4")
//@WebServlet({"/d4","/dd4","/ddd4"}) // 同时配置多个servlet路径
//@WebServlet("/protal/demo4") // 多层路径
//@WebServlet("/start/*")
@WebServlet("*.do") // 扩展名匹配 以.do结尾就可以
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4被调用");
    }
}
