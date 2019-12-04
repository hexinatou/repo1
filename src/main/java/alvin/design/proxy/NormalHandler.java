package alvin.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NormalHandler implements InvocationHandler {
    private Object target;

    public NormalHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("sayTime："+System.currentTimeMillis());
        method.invoke(target,args);
        return null;
    }
}
