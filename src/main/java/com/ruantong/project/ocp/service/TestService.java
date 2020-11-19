package com.ruantong.project.ocp.service;


import com.ruantong.project.ocp.dao.TestMapper;
import com.ruantong.project.ocp.pojo.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class TestService {

    @Autowired
    private TestMapper testDao ;

    public TestPojo getById(Integer id){
        return testDao.getById(id);
    }
}