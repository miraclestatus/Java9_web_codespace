package com.neusoft.web.servlet;

import com.neusoft.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Eric Lee
 * @date 2020/9/1 08:49
 */
@WebServlet("/addUserServlet")
public class AddUserServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 设置编码
        req.setCharacterEncoding("utf-8");

        // 2 .获取参数

        // 3.封装成对象


        // 4.调用service add方法
        UserServiceImpl service = new UserServiceImpl();
//        service.addUser();
        // 5. 重定向到 list.jsp

    }
}
