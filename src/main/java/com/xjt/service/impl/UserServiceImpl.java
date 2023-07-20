package com.xjt.service.impl;

import com.xjt.dao.IUserDao;
import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;
    //insert
    @Override
    public void insertUser(User user) { userDao.insertUser(user); }

    //delete
    @Override
    public void deleteUserById(long id) { userDao.deleteUserById(id); }

    //update
    @Override
    public void updateUserById(User user) { userDao.updateUserById(user); }

    //select
    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
    @Override
    public List<User> selectAllUser() {return userDao.selectUserAll(); }


}
