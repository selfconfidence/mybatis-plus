package com.ml.mybatis.plus.mybatis_plus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mister_wei
 * @version 1.1.1
 * @title web_service
 * @package com.ml.mybatis.plus.mybatis_plus.controller
 * @date 2019/4/18 20:27
 */
@RestController
@CrossOrigin
@RequestMapping("stu")
public class StudentController {

    @RequestMapping(value = "/get",method = {RequestMethod.GET})
    public String getStudent(){
        return "enen";
    }
}
