package com.example.cjw_example.service;

import com.example.cjw_example.service.dto.AdminRequestDTO;
import com.example.cjw_example.service.dto.AdminResponseDTO;

import java.util.List;

public interface AdminService {

    public void saveAdmin(AdminRequestDTO adminDto);

    public List<AdminResponseDTO> getAdminList(Integer pageNum);

    public AdminRequestDTO getId(Long id);

    public void deleteId(Long id);

    public List<AdminResponseDTO> searchId(String keyword);

    public void updateId(Long id, AdminRequestDTO dto);

}
