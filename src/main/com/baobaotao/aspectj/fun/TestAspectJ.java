package main.com.baobaotao.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by qiangber on 17-4-13.
 */
@Aspect
public class TestAspectJ {
    @AfterReturning("target(main.com.baobaotao.aspectj.basic.Seller)")
    public void thisTest() {
        System.out.println("thisTest() executed!");
    }
}
