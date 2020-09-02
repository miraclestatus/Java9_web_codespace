package com.neusoft.service;

import com.neusoft.domain.User;

import java.util.List;

/**
 * 用户管理业务接口
 */


public interface UserService {
    // 查询所有用户信息
    public List<User> findAll();


    void addUser(User user);

    void update(User user);

    void deleteUser(String id);

    User findUserById(String id);

    User login(User user);

    void deleteSelectedUser(String[] ids);

}
