package main.com.baobaotao.aspectj.advanced;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by qiangber on 17-4-14.
 */
@Aspect
public class TestAspect {
    @Before("TestNamePointcut.inPkgGreetTo()")
    public void pkgGreetTo() {
        System.out.println("--pkgGreetTo() executed!--");
    }

    @Before("!target(main.com.baobaotao.aspectj.NaiveWaiter) && TestNamePointcut.inPkgGreetTo()")
    public void pkgGreetToNotNaiveWaiter() {
        System.out.println("--pkgGreetToNotNaiveWaiter() executed!--");
    }

    @Around("execution(* greetTo(..)) && target(main.com.baobaotao.aspectj.NaiveWaiter)")
    public void joinPointAccess(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--joinPointAccess--");

        System.out.println("args[0]:" + pjp.getArgs()[0]);
        System.out.println("signature:" + pjp.getTarget().getClass());

        pjp.proceed();

        System.out.println("--joinPointAccess--");

    }

    @Before("target(main.com.baobaotao.aspectj.NaiveWaiter) && args(name, num)")
    public void bindJoinPointParams(int num, String name) {
        System.out.println("--bindJoinPointParams--");
        System.out.println("name:" + name);
        System.out.println("num:" + num);
        System.out.println("--bindJoinPointParams--");
    }
}
