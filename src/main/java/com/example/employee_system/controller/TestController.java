package com.example.employee_system.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("index");
        return mav;
    }
}
