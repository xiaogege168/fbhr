package com.fubang.limao.mapper;

import com.fubang.limao.domain.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer iddepartment);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer iddepartment);

    List<Department> selectByFactory(Integer factoryId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}