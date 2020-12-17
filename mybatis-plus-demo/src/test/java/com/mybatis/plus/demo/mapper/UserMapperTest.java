package com.mybatis.plus.demo.mapper;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.plus.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author xiazhengyue
 * @since 2020-12-16
 */
@Slf4j
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectByPrimaryKey() {
        User user = userMapper.selectById(3);
        Assertions.assertNotNull(user, "could not found user");
        log.info("user:{}", JSON.toJSONString(user));
    }

    @Test
    public void testQuery() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("id", "name", "age", "email").ge("age", 21);
        List<User> users = userMapper.selectList(userQueryWrapper);
        Assertions.assertTrue(users.size() == 3, "查询数量不符!");
        log.info("user:{}", JSON.toJSONString(users));
    }
}
