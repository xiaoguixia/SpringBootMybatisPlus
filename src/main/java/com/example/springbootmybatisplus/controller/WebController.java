package com.example.springbootmybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.springbootmybatisplus.entity.User;
import com.example.springbootmybatisplus.service.UserService;
import com.example.springbootmybatisplus.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {
    @Autowired
    UserService userService;

    @GetMapping({"/","/login"})
    public String login()
    {
        return "login";
    }

    @PostMapping("/login")
    public String toLogin(User user, HttpSession session)
    {

        User login = userService.login(user);
        if(login!=null)
        return "forward:/index";
        else
        {
            session.setAttribute("PasswordError","密码错误");
            return "login";
        }
    }

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

}
