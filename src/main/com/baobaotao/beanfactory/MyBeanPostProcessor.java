package main.com.baobaotao.beanfactory;

import main.com.baobaotao.reflect.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by qiangber on 17-4-7.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("car")) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("invoke BeanPostProcessor.postProcessBeforeInitialization()\ncolor is null and" +
                        " set it black");
                car.setColor("black");
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("car")) {
            Car car = (Car) bean;
            if (((Car) bean).getMaxSpeed() > 200) {
                System.out.println("invoke BeanPostProcessor.postProcessAfterInitialization()\nmaxSpeed is greater than" +
                        " 200 and now set it 200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
