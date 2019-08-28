package com.example.mybatis_generator.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;
import tk.mybatis.mapper.common.condition.UpdateByConditionMapper;
import tk.mybatis.mapper.common.condition.UpdateByConditionSelectiveMapper;
import tk.mybatis.mapper.common.example.UpdateByExampleSelectiveMapper;

/**
 * @author: zq
 * @Description: 基础更新Mapper接口
 * @date 2018/8/17 15:52
 */
public interface UpdateMapper<T> extends Marker,
		UpdateByPrimaryKeyMapper<T>,
		UpdateByPrimaryKeySelectiveMapper<T>,
		UpdateByConditionMapper<T>,
		UpdateByConditionSelectiveMapper<T>,
		UpdateByExampleSelectiveMapper<T> {
}