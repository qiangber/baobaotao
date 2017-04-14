package main.com.baobaotao.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by qiangber on 17-4-13.
 */
@Aspect
public class PreGreetingAspectj {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you!");
    }
}
