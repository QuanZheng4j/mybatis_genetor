package com.example.generator.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * @author: Mature
 * @Description: 基础插入Mappper接口
 * @date 2018/8/17 15:51
 */
public interface InsertMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.insert.InsertMapper<T>,
		InsertSelectiveMapper<T>,
		MySqlMapper<T> {
}