package com.example.springbootlession3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ContrTest {
    private Map<String,String> param= new HashMap<>();
    @RequestMapping(path="/getMethod",method = RequestMethod.GET)
    public  Object postReq(@RequestParam(value = "id") String id,@RequestParam(value = "pwd") String pwd){
        param.clear();
        param.put(id,id);
        param.put(pwd,pwd);
    return param;
    }

}
