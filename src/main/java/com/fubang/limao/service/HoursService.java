package com.fubang.limao.service;

import com.fubang.limao.domain.Hours;
import com.fubang.limao.mapper.HoursMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HoursService {

    @Resource
    private HoursMapper hoursMapper;


    public int deleteByPrimaryKey(Integer idhours) {
        return hoursMapper.deleteByPrimaryKey(idhours);
    }


    public int insert(Hours record) {
        return hoursMapper.insert(record);
    }


    public int insertSelective(Hours record) {
        return hoursMapper.insertSelective(record);
    }


    public Hours selectByPrimaryKey(Integer idhours) {
        return hoursMapper.selectByPrimaryKey(idhours);
    }


    public int updateByPrimaryKeySelective(Hours record) {
        return hoursMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Hours record) {
        return hoursMapper.updateByPrimaryKey(record);
    }

}



