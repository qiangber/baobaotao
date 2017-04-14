package main.com.baobaotao.reflect;

import java.lang.reflect.Field;

/**
 * Created by qiangber on 17-4-6.
 */
public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("main.com.baobaotao.reflect.Car");

        Car car = (Car) clazz.newInstance();

        Field brand = clazz.getDeclaredField("brand");
        brand.setAccessible(true);
        // 取消 Java 语言访问检查以访问 private 变量否则将抛出 IllegalAccessException 。
        // 如果 JVM 的安全管理器设置了相应的安全机制,调用该方法将抛出 SecurityException 。
        brand.set(car, "红旗");

        Field color = clazz.getDeclaredField("color");
        color.setAccessible(true);
        color.set(car, "红色");

        Field maxSpeed = clazz.getDeclaredField("maxSpeed");
        maxSpeed.setAccessible(true);
        maxSpeed.setInt(car, 200);

        System.out.println(car);
    }
}
