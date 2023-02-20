package com.xjt.dao;

import com.xjt.model.User;

import java.util.List;

public interface IUserDao {
    //insert
    void insertUser(User user);

    //delect
    void delectUserById(long id);

    //update
    void updateUserById(User user);

    //select
    User selectUser(long id);
    List<User> selectUserAll();
}
