package main.com.baobaotao.aspectj;

import main.com.baobaotao.advice.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by qiangber on 17-4-13.
 */
public class AspectJProxyTest {
    public static void main(String[] args) {
        Waiter waiter = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(waiter);
        factory.addAspect(PreGreetingAspectj.class);
        Waiter proxy = factory.getProxy();

        proxy.greetTo("John");
        proxy.serveTo("John");
    }
}
