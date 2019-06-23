package com.zhouson.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhouson
 * @create 2019-06-23 11:34
 */
@Controller
public class FastController {
    //获取配置文件中的"name"信息
    @Value("${person.name}")
    private String name;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        return "name:"+name;
    }
}
