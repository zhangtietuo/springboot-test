package proxy.staticDynamic;

/**
 * @Author:zhangtietuo
 * @Description: 被代理类，目标类
 * @Date: 2018/3/7 11:10
 */
public class Button implements IFunction {


    @Override
    public void click() {
        System.out.println("点击了按钮");
    }
}
