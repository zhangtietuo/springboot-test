package proxy.CGLibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 16:42
 */
public class CgLibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("火车要开啦");
        methodProxy.invokeSuper(o, args);
        System.out.println("火车停下了");
        return null;
    }
}
