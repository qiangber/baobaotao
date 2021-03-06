package main.com.baobaotao.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiangber on 17-4-12.
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();
    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("调用matches(mothod, targetClass)对" + targetClass.getName() + "." + method.getName()
            + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("调用matches(mothod, targetClass, args[])对" + targetClass.getName() + "." + method.getName()
                + "做动态检查");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
