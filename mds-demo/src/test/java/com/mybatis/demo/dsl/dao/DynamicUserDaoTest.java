package com.mybatis.demo.dsl.dao;

import com.alibaba.fastjson.JSON;
import com.mybatis.demo.dsl.entity.DynamicUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

/**
 * @author xiazhengyue
 * @since 2020-12-15
 */
@Slf4j
@SpringBootTest
public class DynamicUserDaoTest {

    @Autowired
    private DynamicUserDao dynamicUserDao;

    @Test
    public void testInsert() {
        DynamicUser dynamicUser = DynamicUser.builder()
                .gender(Byte.valueOf("0"))
                .name("Test11")
                .build();
        int result = dynamicUserDao.insert(dynamicUser);
        log.info("result:{}", result);
    }

    @Test
    public void testInsertSelective() {
        DynamicUser dynamicUser = DynamicUser.builder()
                .name(UUID.randomUUID().toString())
                .build();
        int result = dynamicUserDao.insertSelective(dynamicUser);
        log.info("result:{}", result);
    }

    @Test
    public void testFindByLimitAndOffset() {
        long limit = 2;
        long offset = 1;
        List<DynamicUser> result = dynamicUserDao.findByLimitAndOffset(limit, offset);
        log.info(JSON.toJSONString(result));
    }

    @Test
    public void testSelectByPrimaryKey() {
        Optional<DynamicUser> dynamicUser = dynamicUserDao.selectByPrimaryKey(1);
        log.info("result:{}", dynamicUser.orElse(null));
    }

    @Test
    public void testCountByGender() {
        long countByGender = dynamicUserDao.countByGender(Byte.valueOf("1"));
        log.info("result:{}", countByGender);
    }

}
