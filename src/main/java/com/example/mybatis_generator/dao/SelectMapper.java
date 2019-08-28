package com.example.generator.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.select.*;
import tk.mybatis.mapper.common.condition.SelectByConditionMapper;
import tk.mybatis.mapper.common.condition.SelectCountByConditionMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * @author: Mature
 * @Description: 基础查询Mapper接口
 * @date 2018/8/17 15:53
 */
public interface SelectMapper<T> extends Marker,
		SelectOneMapper<T>,
		tk.mybatis.mapper.common.base.select.SelectMapper<T>,
		SelectAllMapper<T>,
		SelectCountMapper<T>,
		SelectByPrimaryKeyMapper<T>,
		ExistsWithPrimaryKeyMapper<T>,
		SelectByIdsMapper<T>,
		SelectByConditionMapper<T>,
		SelectCountByConditionMapper<T>,
		SelectByExampleMapper<T> {
}
