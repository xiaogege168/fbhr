package com.fubang.limao.service;

import com.fubang.limao.domain.Worker;
import com.fubang.limao.mapper.WorkerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkerService {

    @Resource
    private WorkerMapper workerMapper;


    public int deleteByPrimaryKey(Integer idworker) {
        return workerMapper.deleteByPrimaryKey(idworker);
    }


    public int insert(Worker record) {
        return workerMapper.insert(record);
    }


    public int insertSelective(Worker record) {
        return workerMapper.insertSelective(record);
    }


    public Worker selectByPrimaryKey(Integer idworker) {
        return workerMapper.selectByPrimaryKey(idworker);
    }


    public int updateByPrimaryKeySelective(Worker record) {
        return workerMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Worker record) {
        return workerMapper.updateByPrimaryKey(record);
    }

}



