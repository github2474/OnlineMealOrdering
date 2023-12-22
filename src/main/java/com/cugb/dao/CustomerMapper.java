package com.cugb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cugb.pojo.Customer;


public interface CustomerMapper extends BaseMapper<Customer> {



    /**
     * 开启用户会员状态
     * @param id
     */
    void enableStatus(int id);

}