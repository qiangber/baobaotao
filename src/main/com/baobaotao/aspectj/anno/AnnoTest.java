package main.com.baobaotao.aspectj.anno;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by qiangber on 17-4-13.
 */
public class AnnoTest {
    public static void main(String[] args) {
        Class clazz = ForumService.class;
        Method[] methods = clazz.getMethods();
        for (Method method :
                methods) {
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                if (nt.value()) {
                    System.out.println(method.getName() + "()需要测试");
                    for (Class s :
                            method.getParameterTypes()) {
                        System.out.println(s.getName());
                    }
                    for (Parameter p :
                            method.getParameters()) {
                        System.out.println(p.getName());
                    }
                    Arrays.stream(method.getParameters()).map(Parameter::getName).forEach(System.out::println);
                    Stream.of(method.getParameters()).map(Parameter::getName).map(name -> name.charAt(0));
                } else {
                    System.out.println(method.getName() + "()不需要测试");
                }
            }
        }
    }
}
