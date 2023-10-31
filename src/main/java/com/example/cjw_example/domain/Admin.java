package com.example.cjw_example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.nio.file.FileStore;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin {

    @Id @GeneratedValue
    @Column(name = "EMP_ID")
    private Long id;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 40, nullable = false)
    private String deptName;

    @Builder
    public Admin(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }
}
