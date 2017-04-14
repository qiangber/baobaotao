package main.com.baobaotao.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by qiangber on 17-4-11.
 */
public class GreetingInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("How are you! Mr." + invocation.getArguments()[0]);
        Object obj = invocation.proceed();
        System.out.println("Please enjoy yourself!");
        return obj;
    }
}
