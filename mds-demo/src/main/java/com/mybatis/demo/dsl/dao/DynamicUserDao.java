package com.mybatis.demo.dsl.dao;

import com.mybatis.demo.dsl.entity.DynamicUser;
import com.mybatis.demo.dsl.mapper.DynamicUserMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.mybatis.demo.dsl.mapper.DynamicUserDynamicSqlSupport.dynamicUser;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

/**
 * @author xiazhengyue
 * @since 2020-12-15
 */
@Component
public class DynamicUserDao {

    @Autowired
    private DynamicUserMapper dynamicUserMapper;

    public int insert(DynamicUser record) {
        return dynamicUserMapper.insert(record);
    }

    public int insertSelective(DynamicUser record) {
        return dynamicUserMapper.insertSelective(record);
    }

    public List<DynamicUser> findByLimitAndOffset(long limit, long offset) {
        SelectStatementProvider provider = select(dynamicUser.allColumns())
                .from(dynamicUser)
                .limit(limit)
                .offset(offset)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return dynamicUserMapper.selectMany(provider);
    }



    public Optional<DynamicUser> selectByPrimaryKey(Integer id) {
        return dynamicUserMapper.selectOne(c -> c.where(dynamicUser.id, isEqualTo(id)));
    }

    public long countByGender(Byte gender) {
        return dynamicUserMapper.count(c -> c.where(dynamicUser.gender, isEqualTo(gender)));
    }
}
