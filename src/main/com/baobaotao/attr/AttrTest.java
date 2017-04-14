package main.com.baobaotao.attr;

import main.com.baobaotao.reflect.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-6.
 */
public class AttrTest {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("main/com/baobaotao/attr/beans.xml");
        Boss boss = bf.getBean("boss", Boss.class);
        System.out.println(boss.getCar());
        System.out.println(boss.getFavorites());
    }
}
