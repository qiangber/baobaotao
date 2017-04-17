package main.com.baobaotao.aspectj.advanced;

import main.com.baobaotao.advice.Waiter;
import main.com.baobaotao.aspectj.NaiveWaiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-17.
 */
public class AspectjAdvancedTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/aspectj/advanced/beans.xml");
        NaiveWaiter waiter = (NaiveWaiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        System.out.println("---------------------------");
        waiter.serveTo("John");
        System.out.println("---------------------------");
        waiter.smileTo("Tom", 2);
    }
}
