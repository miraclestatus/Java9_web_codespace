package com.neusoft.web.servlet;

import com.neusoft.service.UserService;
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
@WebServlet("/delUserServlet")
public class DelUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
//        System.out.println(id);

        // 调用service删除
        UserService userService = new UserServiceImpl();
        userService.deleteUser(id);
        // 重定向到list
        resp.sendRedirect(req.getContextPath()+"/userListServlet");


    }
}
