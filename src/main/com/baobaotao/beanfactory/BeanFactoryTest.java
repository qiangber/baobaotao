package main.com.baobaotao.beanfactory;

import main.com.baobaotao.reflect.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-6.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("main/com/baobaotao/beanfactory/beans.xml");
        Car car = bf.getBean("car", Car.class);
        System.out.println(car);
    }
}
