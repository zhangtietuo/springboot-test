package com.ztt.annotation;

import java.lang.annotation.*;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2017/10/16 11:33
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Color {

    /**
     * 颜色属性
     * @return
     */
    Co fruitColor() default Co.GREEN;

}
