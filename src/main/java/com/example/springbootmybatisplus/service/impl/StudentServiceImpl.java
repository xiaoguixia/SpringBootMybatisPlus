package com.example.springbootmybatisplus.service.impl;

import com.example.springbootmybatisplus.entity.Student;
import com.example.springbootmybatisplus.mapper.StudentMapper;
import com.example.springbootmybatisplus.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-05-18
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
