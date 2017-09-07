package com.ztt.Inherit;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description: 多态执行子类方法，父类的属性
 * @Date: Created in 2017/9/7 15:06
 * @Modified by:
 */
public class Child extends Parent{

    public Child() {
        super();
        System.out.println("I AM C class");
    }

    {
        System.out.println("I AM C ");
    }

    static {
        System.out.println("I AM static C ");
    }

    public String age = "8";

    public void eat() {
        System.out.println("C eat!");
    }

    public static void main(String[] args) {
        new Child();
        System.out.println("-------------------------");
        Parent c = new Child();
        c.eat();
        System.out.println(c.age);
    }
}
