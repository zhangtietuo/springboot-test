package com.ztt.GC;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 2017/9/22 11:45
 * @Modified by:
 */
public class GC {

    public static GC SAVE_HOOK = null;

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new GC();
        System.out.println("3" + SAVE_HOOK);
        SAVE_HOOK = null;
        System.out.println("4" + SAVE_HOOK);
        System.gc();
        System.out.println("1" + SAVE_HOOK);
        if (null != SAVE_HOOK) { //此时对象应该处于(reachable, finalized)状态
            System.out.println("Yes , I am still alive");
        } else {
            System.out.println("No , I am dead");
        }
        Thread.sleep(2000);
        SAVE_HOOK = null;
        System.gc();

        System.out.println("2" + SAVE_HOOK);
        if (null != SAVE_HOOK) {
            System.out.println("Yes , I am still alive");
        } else {
            System.out.println("No , I am dead");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("进入finalize方法....");
        super.finalize();
        System.out.println("execute method finalize()");
        SAVE_HOOK = this;
/*
        进入finalize方法....
        execute method finalize()
        1com.ztt.GC@816f27d
        Yes , I am still alive
        2null
        No , I am dead*/

    }
}
