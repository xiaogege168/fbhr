package com.fubang.limao.mapper;

import com.fubang.limao.domain.Manger;

public interface MangerMapper {
    int deleteByPrimaryKey(Integer idmanger);

    int insert(Manger record);

    int insertSelective(Manger record);

    Manger selectByPrimaryKey(Integer idmanger);

    int updateByPrimaryKeySelective(Manger record);

    int updateByPrimaryKey(Manger record);
}