package com.neusoft.dao;

import com.neusoft.domain.User;

import java.util.List;

public interface UserDao {
    // 用户操作dao

    public List<User> findAll();


    public  void add(User user);

    void update(User user);
    void delete(int id);


}
