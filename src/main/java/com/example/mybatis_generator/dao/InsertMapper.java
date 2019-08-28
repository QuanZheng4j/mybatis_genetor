package com.example.mybatis_generator.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * @author: zq
 * @Description: 基础插入Mappper接口
 * @date 2018/8/17 15:51
 */
public interface InsertMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.insert.InsertMapper<T>,
		InsertSelectiveMapper<T>,
		MySqlMapper<T> {
}