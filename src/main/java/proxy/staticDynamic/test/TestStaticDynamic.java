package proxy.staticDynamic.test;

import proxy.staticDynamic.Button;
import proxy.staticDynamic.ButtonProxy;
import proxy.staticDynamic.IFunction;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 11:13
 */
public class TestStaticDynamic {

    public static void main(String[] args) {
        IFunction fun = new Button();
        fun.click();
        System.out.println("----------------------");
        IFunction proxy = new ButtonProxy(fun);
        proxy.click();
    }
}
