package com.zycat.springbootmybatis;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User getUser(int id);

    @Delete("delete * from user where id=#{id}")
    int deleteUser(int id);
    @Select("select * from user ")
    List<User> getAllUsers();
}
