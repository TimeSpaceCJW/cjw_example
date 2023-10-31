package com.example.cjw_example.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminResponseDTO {

    private Long id;
    private String name;
    private String deptName;

    @Builder
    public AdminResponseDTO(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }
}
