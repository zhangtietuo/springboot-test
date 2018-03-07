package com.ztt.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2017/10/13 9:44
 */
public class ConcurrentHashMapTest {

    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

    public static void main(String[] args) {
        new Thread("Thread1"){
            @Override
            public void run() {
                map.put(3, 33);
            }
        }.start();

        new Thread("Thread2"){
            @Override
            public void run() {
                map.put(4, 44);
            }
        };

        new Thread("Thread3"){
            @Override
            public void run() {
                map.put(7, 77);
            }
        };
        System.out.println(map);
    }
}
