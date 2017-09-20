package com.ztt.demo;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/18 15:22
 * @Modified by:
 */
public class Demo {

    public static String str;

    public static void setValue(String str) {
        str = "abc";
    }

    public static void main(String[] args) {
        str = "123";
        setValue(str);
        System.out.println(str);
    }
}
