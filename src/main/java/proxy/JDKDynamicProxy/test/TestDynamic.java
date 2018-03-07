package proxy.JDKDynamicProxy.test;

import proxy.JDKDynamicProxy.DynamicManager;
import proxy.JDKDynamicProxy.Person;
import proxy.JDKDynamicProxy.IFunction;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 14:27
 */
public class TestDynamic {

    public static void main(String[] args) {
        IFunction target = new Person();
        DynamicManager proxyManager = new DynamicManager();
        IFunction proxy = (IFunction) proxyManager.createProxy(target);
        proxy.rentHouse();
    }
}
