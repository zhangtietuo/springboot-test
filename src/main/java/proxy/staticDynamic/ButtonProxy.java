package proxy.staticDynamic;

/**
 * @Author:zhangtietuo
 * @Description: 按钮的代理类
 * @Date: 2018/3/7 11:20
 */
public class ButtonProxy implements IFunction {

    //持有了目标对象的引用
    private IFunction fun;

    public ButtonProxy(IFunction fun) {
        this.fun = fun;
    }

    @Override
    public void click() {
        System.out.println("代理对象---");
        fun.click();
    }
}
