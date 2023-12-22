package com.cugb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cugb.pojo.User;


public interface UserMapper extends BaseMapper<User> {


    /**
     * 停用管理员账号
     * @param name
     */
    void enableStatus(String name);

    /**
     * 开启管理员账号
     * @param name
     */
    void stopStatus(String name);
}