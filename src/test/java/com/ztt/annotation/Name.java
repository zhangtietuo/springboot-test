package com.ztt.annotation;

import java.lang.annotation.*;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2017/10/16 11:32
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Name {
    String value() default "banana";
}
