package com.jooq.demo;

import com.jooq.demo.db.tables.records.DynamicUserRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jooq.demo.db.Tables.DYNAMIC_USER;

/**
 * @author xiazhengyue
 * @since 2020-12-17
 */
@Repository
public class JooqDemoDao {

    @Autowired
    private DSLContext dsl;

    public int saveUser(String name, Byte gender) {
        return dsl.insertInto(DYNAMIC_USER)
                .set(DYNAMIC_USER.NAME, name)
                .set(DYNAMIC_USER.GENDER, gender)
                .execute();
    }

    public List<DynamicUserRecord> pageQuery(String name, Byte gender, int offset, int limit) {
        Condition condition = DSL.noCondition();
        if (!StringUtils.isBlank(name)) {
            condition.and(DYNAMIC_USER.NAME.eq(name));
        }
        if (gender != null) {
            condition.and(DYNAMIC_USER.GENDER.eq(gender));
        }
        return dsl.selectFrom(DYNAMIC_USER)
                .where(condition)
                .offset(offset)
                .limit(limit)
                .fetchInto(DynamicUserRecord.class);
    }

    public DynamicUserRecord selectById(Integer id) {
        return dsl.selectFrom(DYNAMIC_USER)
                .where(DYNAMIC_USER.ID.eq(id))
                .fetchAny();
    }

    public int countUserByGender(Byte gender) {
        return dsl.fetchCount(DYNAMIC_USER, DYNAMIC_USER.GENDER.eq(gender));
    }
}
