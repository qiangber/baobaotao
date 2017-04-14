package main.com.baobaotao.fb;

import main.com.baobaotao.editor.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-11.
 */
public class FactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/com/baobaotao/fb/beans.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        CarFactoryBean carFactoryBean = (CarFactoryBean) applicationContext.getBean("&car");
        System.out.println(carFactoryBean.getCarInfo());
    }
}
