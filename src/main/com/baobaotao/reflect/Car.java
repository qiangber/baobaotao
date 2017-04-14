package main.com.baobaotao.reflect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by qiangber on 17-4-6.
 */
public class Car implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("car init");
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("invoke BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String name) {
        System.out.println("invoke BeanNameAware.setBeanName()");
        this.beanName = name;
    }

    public void destroy() throws Exception {
        System.out.println("invoke Disposable.destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("invoke InitializingBean.afterPropertiesSet()");
    }

    public void myInit() {
        System.out.println("invoke init-method's initial method");
        this.maxSpeed = 222;
    }

    public void myDestroy() {
        System.out.println("invoke destroy-method's destroy method");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("invoke setBrand()");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
