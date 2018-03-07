package com.ztt.annotation;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2017/10/16 11:43
 */
public class Apple {

    @Name(value = "apple")
    private String appleName;

    @Color(fruitColor = Co.BLUE)
    private String appleColor;




    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }


    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void displayName(){
        System.out.println("水果的名字是：" + appleName);
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        a.displayName();
    }
}