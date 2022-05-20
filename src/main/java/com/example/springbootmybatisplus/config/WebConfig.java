package com.example.springbootmybatisplus.config;

import com.example.springbootmybatisplus.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(
                "/", "/login", "/css/**", "/js/**", "/fonts/**", "/images/**","/druid/**","/sql");
    }


}
