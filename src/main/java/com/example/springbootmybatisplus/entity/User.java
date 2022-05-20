package com.example.springbootmybatisplus.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-05-18
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;


}
