package com.ruantong.project.ocp.controller;


import com.ruantong.project.ocp.pojo.TestPojo;
import com.ruantong.project.ocp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public TestPojo test(@PathVariable Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }
}
