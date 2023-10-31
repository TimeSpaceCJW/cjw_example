package com.example.cjw_example.service.mapper;


import com.example.cjw_example.domain.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("SELECT * FROM ADMIN")
    List<Admin> findAll();

    @Select("SELECT * FROM MEMBER WHERE id=#{id}")
    Admin findById(@Param("id") Long id);
}
