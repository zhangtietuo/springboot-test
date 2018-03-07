package com.ztt.annotation;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2017/10/16 11:36
 */
public enum Co {

    BLUE(1,"蓝色"),

    GREEN(2,"绿色"),

    YELLOW(3,"黄色");

    private Integer type;

    private String color;

    Co(Integer type, String color) {
        this.type = type;
        this.color = color;
    }

}
