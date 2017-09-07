package com.ztt.Thread;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/7 15:36
 * @Modified by:
 */
public class Test extends Thread {

    @Override
    public void run() {
        System.out.println("run...");
    }

    @Override
    public synchronized void start() {
        System.out.println("start...");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println("run test...");
    }
}
