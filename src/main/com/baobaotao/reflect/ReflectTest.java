package main.com.baobaotao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by qiangber on 17-4-6.
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("main.com.baobaotao.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car) cons.newInstance();

        Method setBrand = clazz.getDeclaredMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗AAA");
        Method setColor = clazz.getDeclaredMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        System.out.println(car.toString());
    }
}
