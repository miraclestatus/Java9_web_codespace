package com.neusoft.dao;

import com.neusoft.domain.User;

import java.util.List;

public interface UserDao {
    // 用户操作dao

    public List<User> findAll();

    public  void add(User user);

    public void update(User user);

    public void delete(int id);

    public User findById(int id);

    public User findUserByUserNameAndPassword(String username, String password);
}
