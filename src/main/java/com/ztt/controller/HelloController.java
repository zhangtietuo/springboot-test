package com.ztt.controller;

import com.ztt.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tietuo.zhang
 * @Description:
 * @Date: Created in 17:46 2017/2/21
 * @Modified by:
 */
@RestController
@RequestMapping("/")
public class HelloController {

    /**
     * 引用配置文件里的属性
     */
    @Value("${manSize}")
    private String size;

    @Value("${content}")
    private String content;

    @Autowired
    private Girl girl;

    @Autowired
    CounterService counterService;

    /**
     * http://localhost:8081/myProject/hi  or http://localhost:8081/myProject/helloMan/123
     * @param manId
     * @return
     */
    @RequestMapping(value = {"/helloMan/{id}","/hi"} , method = RequestMethod.GET)
    public String helloMan(@PathVariable(value = "id" , required = false) Integer manId){
        return content + " " + manId;
    }

    /**
     * http://localhost:8081/myProject/helloMan?id=213
     * @param girlId
     * @return
     */
    @GetMapping(value = "/helloGirl")
    public String helloGirl(@RequestParam(value = "id" , required = false , defaultValue = "100") Integer girlId){
        return "罩杯：" + girl.getCupSize() + ",年龄：" + girl.getAge() + " " + girlId;
    }

    /**
     * http://localhost:8080/myProject/metrics
     * @return
     */
    @RequestMapping("/hello")
    public String greet() {
        counterService.increment("didispace.hello.count");
        return "";
    }

}
