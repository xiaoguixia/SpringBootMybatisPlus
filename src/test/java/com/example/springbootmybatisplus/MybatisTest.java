package com.example.springbootmybatisplus;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.example.springbootmybatisplus.entity.User;
import com.example.springbootmybatisplus.mapper.UserMapper;
import  org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

/*
@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    void testSelect()
    {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
}
*/
