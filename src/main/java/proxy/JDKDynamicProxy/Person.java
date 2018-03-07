package proxy.JDKDynamicProxy;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 14:05
 */
public class Person implements IFunction {

    @Override
    public void rentHouse() {
        System.out.println("我找房子");
    }
}
