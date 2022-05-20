package com.example.springbootmybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootmybatisplus.entity.User;
import com.example.springbootmybatisplus.mapper.UserMapper;
import com.example.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2022-05-18
 */
@RestController

public class UserController {

   @Autowired
    private UserService userService;
   @Autowired
    DataSource dataSource;
   @RequestMapping("/user1")
   public User test()
   {
       LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
       wrapper.eq(User::getUsername,"hx");
       System.out.println(dataSource.getClass());
       return userService.getOne(wrapper);
   }
}
