package com.example.cjw_example.service.dto;

import com.example.cjw_example.domain.Admin;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
public class AdminRequestDTO {

    private Long id;
    private String name;
    private String deptName;

    @Builder
    public AdminRequestDTO(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }

    public Admin ToEntity() {
        return Admin.builder()
                .name(this.name)
                .deptName(this.deptName)
                .build();
    }
}
