package main.com.baobaotao.aspectj.basic;

import main.com.baobaotao.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-13.
 */
public class DeclareParentsTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/aspectj/basic/beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");

        waiter.greetTo("XQ");
        waiter.serveTo("XQ");
        ((Seller) waiter).sell("bear", "John");
    }
}
