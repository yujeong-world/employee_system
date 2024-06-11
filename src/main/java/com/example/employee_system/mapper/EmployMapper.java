package com.example.employee_system.mapper;

import com.example.employee_system.dto.EmployDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployMapper {
    public List<EmployDto> selectEmployList();
}
