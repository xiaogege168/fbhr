package com.fubang.limao.mapper;

import com.fubang.limao.domain.Factory;

import java.util.List;

public interface FactoryMapper {
    int deleteByPrimaryKey(Integer idfactory);

    int insert(Factory record);

    int insertSelective(Factory record);

    Factory selectByPrimaryKey(Integer idfactory);

    List<Factory> selectAll();

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKey(Factory record);
}