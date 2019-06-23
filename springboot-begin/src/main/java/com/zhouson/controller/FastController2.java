package com.zhouson.controller;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhouson
 * @create 2019-06-23 11:34
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class FastController2 {
    //获取配置文件中的"name"信息
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        return "name:"+name+" age:"+age;
    }
}
