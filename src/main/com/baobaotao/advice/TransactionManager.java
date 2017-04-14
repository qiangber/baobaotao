package main.com.baobaotao.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by qiangber on 17-4-11.
 */
public class TransactionManager implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("----------");
        System.out.println(method.getName());
        System.out.println("抛出异常：" + e.getMessage());
        System.out.println("成功回滚事务！");
    }
}
