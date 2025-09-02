package com.exampleaaa.exampleeee.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exampleaaa.exampleeee.dal.dpo.ExampleDPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper 接口，映射 example 表
 * 提供基础的 CRUD 操作，由 MyBatis-Plus 实现
 */
@Mapper
public interface ExampleMapper extends BaseMapper<ExampleDPO> {
}
