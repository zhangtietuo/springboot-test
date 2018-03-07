package proxy.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 14:16
 */
public class DynamicManager {

    //目标对象引用
    public Object target;

    public Object createProxy(Object target) {
        //初始化目标对象
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InnerClass());
    }

    /**
     * 定义用于处理代理对象的回调类
     */
    private class InnerClass implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //用反射的方式调用目标对象方法
            Object value = method.invoke(target, args);
            System.out.println("代理对象");
            return value;
        }
    }
}
