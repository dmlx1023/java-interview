package com.zycat.springbootmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransActionService {
    @Autowired
    UserMapper userMapper;
    @Transactional(propagation = Propagation.REQUIRED)
    public void tranasction_require(User user){
        userMapper.deleteUser(1);
    }
}
