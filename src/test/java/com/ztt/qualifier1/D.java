package com.ztt.qualifier1;

import com.ztt.qualifier.A;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/22 10:06
 * @Modified by:
 */
public class D extends A {

    @Override
    protected void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
    }

    public void test() {
        A objectA = new A();
        String a = objectA.a;
        String b = objectA.b;
        String c = objectA.c;
        String d = objectA.d;
        objectA.a();
        objectA.b();
        objectA.c();
        objectA.d();
    }
}
