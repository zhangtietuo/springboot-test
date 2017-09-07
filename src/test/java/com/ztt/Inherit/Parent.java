package com.ztt.Inherit;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/7 15:06
 * @Modified by:
 */
public class Parent {

    public Parent() {
        System.out.println("I AM P class");
    }

    {
        System.out.println("I AM P ");
    }

    public void eat() {
        System.out.println("P eat!");
    }

    public String age = "58";

    static {
        System.out.println("I AM static P ");
    }
}
