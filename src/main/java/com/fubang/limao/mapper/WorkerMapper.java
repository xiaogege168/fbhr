package com.fubang.limao.mapper;

import com.fubang.limao.domain.Worker;

import java.util.List;

public interface WorkerMapper {
    int deleteByPrimaryKey(Integer idworker);

    int insert(Worker record);

    int insertSelective(Worker record);

    Worker selectByPrimaryKey(Integer idworker);

    List<Worker> selectAll( );

    Worker login(String name,String password );

    List<Worker> selectAllAll( );

    int updateByPrimaryKeySelective(Worker record);

    int updateByPrimaryKey(Worker record);
}