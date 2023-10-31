package com.example.cjw_example.controller;

import com.example.cjw_example.domain.Admin;
import com.example.cjw_example.repository.AdminRepository;
import com.example.cjw_example.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AdminController {

    private AdminService adminService;

    @GetMapping("/admin")
    @CrossOrigin(origins="http://localhost:3000")
    public List<Admin> getAdminList() {
        return adminService.findAll();
    }

    @GetMapping("/admin/{id}")
    @CrossOrigin(origins="http://localhost:3000")
    public Admin getAdmin(@PathVariable("id") Long id) {
        return adminService.findOne(id);
    }

    @PostMapping("/admin")
    @CrossOrigin(origins="http://localhost:3000")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminService.save(admin);
    }

    @PutMapping("/admin/{id}")
    @CrossOrigin(origins="http://localhost:3000")
    public Admin updateAdmin(@RequestBody Admin admin, @PathVariable("id") Long id) {
        return adminService.update(id, admin);
    }

    @DeleteMapping("/admin/{id}")
    @CrossOrigin(origins="http://localhost:3000")
    public void deleteAdmin(@PathVariable("id") Long id) {
        adminService.delete(id);
    }
}
