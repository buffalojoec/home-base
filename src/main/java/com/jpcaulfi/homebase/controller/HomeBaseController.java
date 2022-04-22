package com.jpcaulfi.homebase.controller;

import com.jpcaulfi.homebase.service.HomeBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeBaseController {

    @Autowired
    HomeBaseService homeBaseService;

    @GetMapping("/switchCategory/{newCategory}")
    public String switchCategory(@PathVariable String newCategory) {
        homeBaseService.switchCategory(newCategory);
        return "Category changed to " + newCategory.toUpperCase() + ". Refreshing content...";
    }
}
