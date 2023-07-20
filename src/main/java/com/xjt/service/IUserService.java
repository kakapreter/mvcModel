package com.xjt.service;

import com.xjt.model.User;

import java.util.List;

public interface IUserService {
    //insert
    void insertUser(User user);

    //delect
    void deleteUserById(long id);

    //update
    void updateUserById(User user);

    //select
    User selectUser(long userId);
    List<User> selectAllUser();
}
