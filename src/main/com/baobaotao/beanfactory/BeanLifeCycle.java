package main.com.baobaotao.beanfactory;

import main.com.baobaotao.reflect.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-7.
 */
public class BeanLifeCycle {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("main/com/baobaotao/beanfactory/beans.xml");

        Car car = (Car) bf.getBean("car");
        System.out.println(car);
        car.setColor("red");
        System.out.println(car);

        Car car2 = (Car) bf.getBean("car");
        System.out.println(car == car2);
        System.out.println(car2);
    }
}
