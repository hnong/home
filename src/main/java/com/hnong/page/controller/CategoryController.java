package com.hnong.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CategoryController {
    @RequestMapping("/category")
    public ModelAndView category(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("/page/web/category");
    }
}
