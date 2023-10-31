package com.example.cjw_example.service;

import com.example.cjw_example.domain.Admin;
import com.example.cjw_example.exception.ResourceNotFoundException;
import com.example.cjw_example.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class AdminService {

    private AdminRepository adminRepository;

    // 관리자 전체 조회
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    // 관리자 단일조회
    public Admin findOne(Long id) {
        return adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin", "id", id));
    }

    // 관리자 저장
    @Transactional
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    // 관리자 업데이트
    @Transactional
    public Admin update(Long id, Admin newAdmin) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin", "id", id));
        admin.setName(newAdmin.getName());
        admin.setDeptName(newAdmin.getDeptName());

        return adminRepository.save(admin);
    }

    // 관리자 삭제
    @Transactional
    public void delete(Long id) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin", "id", id));
        adminRepository.delete(admin);
    }


}
