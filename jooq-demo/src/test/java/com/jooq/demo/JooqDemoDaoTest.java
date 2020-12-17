package com.jooq.demo;

import com.jooq.demo.db.tables.records.DynamicUserRecord;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

/**
 * @author xiazhengyue
 * @since 2020-12-17
 */
@Slf4j
@SpringBootTest
public class JooqDemoDaoTest {

    @Autowired
    private JooqDemoDao jooqDemoDao;

    @Test
    public void testSaveUser() {
        String name = UUID.randomUUID().toString();
        Byte gender = Byte.valueOf("0");
        int result = jooqDemoDao.saveUser(name, gender);
        Assert.isTrue(result > 0, "insert failed");
        log.info("result:{}", result);
    }

    @Test
    public void testPageQuery() {
        Byte gender = Byte.valueOf("0");
        int offset = 1;
        int limit = 2;
        List<DynamicUserRecord> result = jooqDemoDao.pageQuery(null, gender, offset, limit);
        log.info("result:{}", result.toArray());
    }

    @Test
    public void testFindById() {
        DynamicUserRecord result = jooqDemoDao.selectById(1);
        log.info("result:\n{}", result);
    }

    @Test
    public void testCountUserByGender(){
        int female = jooqDemoDao.countUserByGender(Byte.valueOf("0"));
        System.out.println(female);

        int male = jooqDemoDao.countUserByGender(Byte.valueOf("1"));
        System.out.println(male);
    }
}
