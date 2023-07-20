package com.xjt.controller;

import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //insert
    @RequestMapping("/insert")
    public void insertUser()throws Exception{
        User user = new User();
        user.setUsername("ssss");
        user.setMobile("11111");
        user.setEmail("222222");
        user.setRole("2321");
        userService.insertUser(user);
    }

    //delete
    @RequestMapping("/delete")
    public void deleteUserById() throws Exception{
        userService.deleteUserById(1);
    }

    //update
    @RequestMapping("/update")
    public void updateUserById() throws Exception{
        User user = new User();
        user.setId(1);
        user.setUsername("sss4");
        user.setMobile("444");
        user.setEmail("444");
        user.setRole("2444");
        userService.updateUserById(user);
    }

    //select
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        User user = userService.selectUser(1);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
    @RequestMapping("/selectAll")
    public ModelAndView selectUserAll() throws Exception {
        List<User> users =  userService.selectAllUser();
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        //发送的jsp页面的名
        mv.setViewName("users");
        return mv;

    }

}
