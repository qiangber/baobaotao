package main.com.baobaotao.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-11.
 */
public class ThrowAdviceTest {
    public static void main(String[] args) throws Throwable {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/advice/beans.xml");
        ForumService proxy = (ForumService) ctx.getBean("forumService");
        proxy.removeTopic(2);
        proxy.removeForum(1);
    }
}
