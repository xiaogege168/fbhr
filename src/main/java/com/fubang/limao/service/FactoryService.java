package com.fubang.limao.service;

import com.fubang.limao.domain.Factory;
import com.fubang.limao.mapper.FactoryMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class FactoryService {

    @Resource
    private FactoryMapper factoryMapper;


    public int deleteByPrimaryKey(Integer idfactory) {
        return factoryMapper.deleteByPrimaryKey(idfactory);
    }


    public int insert(Factory record) {
        return factoryMapper.insert(record);
    }


    public int insertSelective(Factory record) {
        return factoryMapper.insertSelective(record);
    }


    public Factory selectByPrimaryKey(Integer idfactory) {
        return factoryMapper.selectByPrimaryKey(idfactory);
    }


    public int updateByPrimaryKeySelective(Factory record) {
        return factoryMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Factory record) {
        return factoryMapper.updateByPrimaryKey(record);
    }

}



