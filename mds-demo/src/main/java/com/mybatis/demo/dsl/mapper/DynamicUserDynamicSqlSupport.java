package com.mybatis.demo.dsl.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DynamicUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.314+08:00", comments="Source Table: dynamic_user")
    public static final DynamicUser dynamicUser = new DynamicUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.314+08:00", comments="Source field: dynamic_user.id")
    public static final SqlColumn<Integer> id = dynamicUser.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.32+08:00", comments="Source field: dynamic_user.name")
    public static final SqlColumn<String> name = dynamicUser.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.32+08:00", comments="Source field: dynamic_user.gender")
    public static final SqlColumn<Byte> gender = dynamicUser.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.314+08:00", comments="Source Table: dynamic_user")
    public static final class DynamicUser extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> gender = column("gender", JDBCType.TINYINT);

        public DynamicUser() {
            super("dynamic_user");
        }
    }
}