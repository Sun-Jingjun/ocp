package com.ruantong.project.ocp.dao;


import com.ruantong.project.ocp.pojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestPojo getById(Integer id);

}
