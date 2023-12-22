package com.cugb;

import com.cugb.dao.UserMapper;
import com.cugb.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class OnlineMealOrderingApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setPassword("111111");
        user.setId(11111L);
        user.setAddress("北京市");
        user.setLasttime(new Date());
        user.setPhone("18747837749");
        user.setSalt("1234567");
        int res = userMapper.insert(user);
        System.out.println(res);
        System.out.println(user);
    }

}
