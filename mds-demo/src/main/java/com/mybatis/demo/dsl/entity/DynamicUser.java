package com.mybatis.demo.dsl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUser {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.303+08:00", comments="Source field: dynamic_user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.307+08:00", comments="Source field: dynamic_user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.308+08:00", comments="Source field: dynamic_user.gender")
    private Byte gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.307+08:00", comments="Source field: dynamic_user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.307+08:00", comments="Source field: dynamic_user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.307+08:00", comments="Source field: dynamic_user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.308+08:00", comments="Source field: dynamic_user.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.308+08:00", comments="Source field: dynamic_user.gender")
    public Byte getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-17T17:55:41.308+08:00", comments="Source field: dynamic_user.gender")
    public void setGender(Byte gender) {
        this.gender = gender;
    }
}