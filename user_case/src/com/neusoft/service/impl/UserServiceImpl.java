package com.neusoft.service.impl;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import com.neusoft.service.UserService;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/31 14:47
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        // 调用dao 查询
        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        // 添加用户
        dao.add(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }
}
