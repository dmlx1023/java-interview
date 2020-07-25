package com.zycat.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

@SpringBootApplication
@MapperScan("com.zycat.springbootmybatis")
public class SpringbootMybatisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

    @Autowired
    UserMapper userMapper;
    @Override
    public void run(String... args) throws Exception {
        User user=userMapper.getUser(1);
        Assert.notNull(user);
        System.out.println(user);

    }
}
