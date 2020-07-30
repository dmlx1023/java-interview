package com.zycat.springbootmybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
//@TestPropertySource(properties = {"spring.config.location=classpath:application.yml"})
class SpringbootMybatisApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
       List<User> l= userMapper.getAllUsers();
        Assert.notEmpty(l);
        System.out.println(l);
    }

}
