package com.zycat.springbootmybatis;

import org.apache.ibatis.annotations.Select;

public interface UserMapper  {
    @Select("select * from user where id=#{id}")
    User getUser(int id);
}
