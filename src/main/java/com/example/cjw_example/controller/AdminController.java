package com.example.cjw_example.controller;

import com.example.cjw_example.domain.Admin;
import com.example.cjw_example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public List<Admin> getId() {
        return adminService.getId();
    }

    @GetMapping
    public Admin findId(@PathVariable("id") Long id) {
        return adminService.findId(id);
    }
}
