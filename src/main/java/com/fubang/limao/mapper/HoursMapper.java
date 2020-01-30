package com.fubang.limao.mapper;

import com.fubang.limao.domain.Hours;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HoursMapper {
    int deleteByPrimaryKey(Integer idhours);

    int insert(Hours record);

    int insertSelective(Hours record);

    Hours selectByPrimaryKey(Integer idhours);

    List<Hours> selectByWorker( @Param("workerId") Integer workerId, @Param("month") String month);

    List<Hours> selectByWorkerA( @Param("workerId") Integer workerId,@Param("month") String month);

    Hours selectByWorkerToday(Integer workerId);

    int updateByPrimaryKeySelective(Hours record);

    int updateQingjia(Hours record);

    int updateJiezi(Hours record);

    int updateByPrimaryKey(Hours record);
}