package com.neusoft.test;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/31 15:11
 */
public class TestUserDaoImpl {
    @Test
    public void userDaoImplTest(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        User user = new User();
        user.setName("dada");
        user.setGender("人妖");
        user.setAddress("泰国");
        user.setQq("23123213");
        user.setAge(323);
        user.setEmail("3242342@qq.com");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
}
