package com.fubang.limao.service;

import com.fubang.limao.domain.Manger;
import com.fubang.limao.mapper.MangerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MangerService {

    @Resource
    private MangerMapper mangerMapper;


    public int deleteByPrimaryKey(Integer idmanger) {
        return mangerMapper.deleteByPrimaryKey(idmanger);
    }


    public int insert(Manger record) {
        return mangerMapper.insert(record);
    }


    public int insertSelective(Manger record) {
        return mangerMapper.insertSelective(record);
    }


    public Manger selectByPrimaryKey(Integer idmanger) {
        return mangerMapper.selectByPrimaryKey(idmanger);
    }


    public int updateByPrimaryKeySelective(Manger record) {
        return mangerMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Manger record) {
        return mangerMapper.updateByPrimaryKey(record);
    }

}



