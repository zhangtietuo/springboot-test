package proxy.CGLibDynamicProxy.test;

import proxy.CGLibDynamicProxy.CgLibProxy;
import proxy.CGLibDynamicProxy.Train;
import proxy.CGLibDynamicProxy.TrainChild;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 17:01
 */
public class TestCgLibProxy {

    public static void main(String[] args) {
        Train t = new TrainChild();
        CgLibProxy cgLibProxy = new CgLibProxy();
        Train train = (Train) cgLibProxy.getProxy(Train.class);
        train.say();
    }
}
