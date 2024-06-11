package com.example.employee_system.controller;

import com.example.employee_system.dto.EmployDto;
import com.example.employee_system.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/list")
    public ModelAndView employeeList(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("employeeList");
        List<EmployDto> employList = employeeService.employList();
        mav.addObject("employList", employList);

        return mav;
    }
}
