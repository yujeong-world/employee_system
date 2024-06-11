package com.example.employee_system.service;

import com.example.employee_system.dto.EmployDto;
import com.example.employee_system.mapper.EmployMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployMapper employMapper;
    public List<EmployDto> employList(){
        return employMapper.selectEmployList();
    }
}
