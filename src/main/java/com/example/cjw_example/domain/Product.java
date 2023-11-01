package com.example.cjw_example.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 40, nullable = false)
    private String name;

    @Column(name = "detail", length = 500, nullable = false)
    private String detail;

    @Column(name = "price")
    private Long price;

    @Builder
    public Product(String name, String detail, Long price) {
        this.name = name;
        this.detail = detail;
        this.price = price;
    }
}
