package main.com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-11.
 */
public class BeforeAdviceTest {
    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        factory.setInterfaces(target.getClass().getInterfaces());
        factory.setOptimize(true);

        Waiter proxy = (Waiter) factory.getProxy();
        proxy.greetTo("qiangber");
        proxy.serveTo("qiangber");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/advice/beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
