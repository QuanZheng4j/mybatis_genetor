package com.example.generator.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.condition.DeleteByConditionMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

/**
 * @author: Mature
 * @Description: 基础删除Mapper接口
 * @date 2018/8/17 15:54
 */
public interface DeleteMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.delete.DeleteMapper<T>,
		DeleteByPrimaryKeyMapper<T>,
		DeleteByConditionMapper<T>,
		DeleteByIdsMapper<T> {
}
