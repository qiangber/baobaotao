package main.com.baobaotao.context;

import main.com.baobaotao.reflect.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by qiangber on 17-4-6.
 */
public class AnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }
}
