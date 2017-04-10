package com.ztt.List;


import java.util.*;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 12:02 2017/3/16
 * @Modified by:
 */
public class ArrayList {
    public static void main(String[] args) {
        List l = new java.util.ArrayList();
        Set s = new HashSet();
        l.add(1);
        l.add(1,'2');
        l.add(1,'3');
        int i = 1;
        int a = 4;
        int b = 5;
        int c = 6;
        for(int k=l.size()-1;k>i-1;k--){
            l.add(k+3,l.get(k));
        }
        Queue q= new LinkedList();
        System.out.println(l.size());
    }

}
