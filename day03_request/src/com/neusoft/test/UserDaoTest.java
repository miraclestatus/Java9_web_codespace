package com.neusoft.test;

import com.neusoft.dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import org.junit.Test;

import java.sql.SQLException;

/**
 * @author Eric Lee
 * @date 2020/8/28 10:54
 */
public class UserDaoTest {
    @Test
    public void test() throws SQLException {
        User loginUser = new User();
        loginUser.setUsename("bigbaby");
        loginUser.setPassword("12345");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
