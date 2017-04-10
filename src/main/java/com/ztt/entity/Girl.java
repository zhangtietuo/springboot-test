package com.ztt.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: tietuo.zhang
 * @Description:
 * @Date: Created in 10:14 2017/2/22
 * @Modified by:
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {

    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
