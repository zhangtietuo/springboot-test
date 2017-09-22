package com.ztt.GC;


import java.lang.ref.SoftReference;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/22 14:54
 * @Modified by:
 */
public class SoftReferenceTest {

    public static void main(String[] args) {
        Object o = new Object();
        SoftReference sr=new SoftReference(o);//缓存作用
        o = null;
        if (sr!=null) {
            System.out.println("sd");
        };
    }
}
