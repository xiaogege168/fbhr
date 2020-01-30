package com.fubang.limao.service;

import com.fubang.limao.domain.Department;
import com.fubang.limao.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;


    public int deleteByPrimaryKey(Integer iddepartment) {
        return departmentMapper.deleteByPrimaryKey(iddepartment);
    }


    public int insert(Department record) {
        return departmentMapper.insert(record);
    }


    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }


    public Department selectByPrimaryKey(Integer iddepartment) {
        return departmentMapper.selectByPrimaryKey(iddepartment);
    }


    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }

}



