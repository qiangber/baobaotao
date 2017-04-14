package main.com.baobaotao.aspectj.fun;

import main.com.baobaotao.advice.Waiter;
import main.com.baobaotao.aspectj.basic.Seller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-13.
 */
public class AspectJThisTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/aspectj/fun/beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");

        waiter.greetTo("XQ");
        waiter.serveTo("XQ");
        ((Seller) waiter).sell("bear", "John");
    }
}
