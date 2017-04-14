package main.com.baobaotao.introduce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-11.
 */
public class IntroduceTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/introduce/beans.xml");
        ForumService service = (ForumService) ctx.getBean("forumService");
        service.removeTopic(1);
        service.removeForum(1);

        ((Monitorable) service).setMonitorActive(true);
        service.removeTopic(2);
        service.removeForum(2);

        System.out.println("-----------------------");
        ForumService service1 = (ForumService) ctx.getBean("forumService2");
        service1.removeForum(1);
        ((Monitorable) service1).setMonitorActive(true);
        service1.removeForum(1);
    }
}
