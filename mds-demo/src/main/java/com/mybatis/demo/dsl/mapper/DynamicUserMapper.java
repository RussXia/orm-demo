package com.mybatis.demo.dsl.mapper;

import static com.mybatis.demo.dsl.mapper.DynamicUserDynamicSqlSupport.*;

import com.mybatis.demo.dsl.entity.DynamicUser;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface DynamicUserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.373+08:00", comments="Source Table: dynamic_user")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, gender);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.321+08:00", comments="Source Table: dynamic_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.323+08:00", comments="Source Table: dynamic_user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.324+08:00", comments="Source Table: dynamic_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DynamicUser> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.325+08:00", comments="Source Table: dynamic_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DynamicUser> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.335+08:00", comments="Source Table: dynamic_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DynamicUserResult")
    Optional<DynamicUser> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.35+08:00", comments="Source Table: dynamic_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DynamicUserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.TINYINT)
    })
    List<DynamicUser> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.355+08:00", comments="Source Table: dynamic_user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.355+08:00", comments="Source Table: dynamic_user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.356+08:00", comments="Source Table: dynamic_user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.366+08:00", comments="Source Table: dynamic_user")
    default int insert(DynamicUser record) {
        return MyBatis3Utils.insert(this::insert, record, dynamicUser, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.371+08:00", comments="Source Table: dynamic_user")
    default int insertMultiple(Collection<DynamicUser> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, dynamicUser, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.372+08:00", comments="Source Table: dynamic_user")
    default int insertSelective(DynamicUser record) {
        return MyBatis3Utils.insert(this::insert, record, dynamicUser, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.375+08:00", comments="Source Table: dynamic_user")
    default Optional<DynamicUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.375+08:00", comments="Source Table: dynamic_user")
    default List<DynamicUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.375+08:00", comments="Source Table: dynamic_user")
    default List<DynamicUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.376+08:00", comments="Source Table: dynamic_user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dynamicUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.377+08:00", comments="Source Table: dynamic_user")
    static UpdateDSL<UpdateModel> updateAllColumns(DynamicUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(gender).equalTo(record::getGender);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.378+08:00", comments="Source Table: dynamic_user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DynamicUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(gender).equalToWhenPresent(record::getGender);
    }
}