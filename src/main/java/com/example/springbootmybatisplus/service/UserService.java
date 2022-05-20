package com.example.springbootmybatisplus.service;

import com.example.springbootmybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2022-05-18
 */
public interface UserService extends IService<User> {
   User login(User user);
}
