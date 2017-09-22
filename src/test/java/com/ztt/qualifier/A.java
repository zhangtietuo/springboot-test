package com.ztt.qualifier;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/22 9:46
 * @Modified by:
 */
public class A {

    private String a = "1";
    String b;
    protected String c;
    public String d;

    private void a() {
        System.out.println("a");
    }

    void b() {
        System.out.println("b");
    }

    protected void c() {
        System.out.println("c");
    }

    public void d() {
        System.out.println("d");
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
