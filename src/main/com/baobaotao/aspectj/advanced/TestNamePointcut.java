package main.com.baobaotao.aspectj.advanced;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by qiangber on 17-4-14.
 */
public class TestNamePointcut {
    @Pointcut("within(main.com.baobaotao.aspectj.*)")
    private void inPackage() {}

    @Pointcut("execution(* greetTo(..))")
    protected void greetTo() {}

    @Pointcut("inPackage() && greetTo()")
    public void inPkgGreetTo() {}
}
