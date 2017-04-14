package main.com.baobaotao.autoproxy;

import main.com.baobaotao.advisor.Seller;
import main.com.baobaotao.advisor.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-12.
 */
public class AutoProxyTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/autoproxy/beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");

        waiter.greetTo("Tom");
        seller.greetTo("Jack");

    }
}
