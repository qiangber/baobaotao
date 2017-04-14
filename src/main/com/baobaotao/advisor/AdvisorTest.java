package main.com.baobaotao.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-12.
 */
public class AdvisorTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/advisor/beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("John");
        seller.greetTo("John");

        System.out.println("------------------------------");
        Waiter waiter1 = (Waiter) ctx.getBean("waiter1");
        waiter1.greetTo("haha");
        waiter1.serveTo("haha");

        System.out.println("------------------------------");
        Waiter waiter2 = (Waiter) ctx.getBean("waiter2");
        waiter2.serveTo("Peter");
        waiter2.greetTo("Peter");
        waiter2.serveTo("Tom");
        waiter2.greetTo("Tom");

        System.out.println("------------------------------");
        Waiter waiter3 = (Waiter) ctx.getBean("waiter3");
        WaiterDelegate waiterDelegate = new WaiterDelegate();
        waiterDelegate.setWaiter(waiter3);
        waiter3.greetTo("Tom");
        waiter3.serveTo("Tom");
        waiterDelegate.service("John");

        System.out.println("------------------------------");
        Waiter waiter4 = (Waiter) ctx.getBean("waiter4");
        WaiterDelegate waiterDelegate1 = new WaiterDelegate();
        waiterDelegate1.setWaiter(waiter4);
        waiter4.greetTo("QQ");
        waiter4.serveTo("QQ");
        waiterDelegate1.service("OICQ");
    }
}
