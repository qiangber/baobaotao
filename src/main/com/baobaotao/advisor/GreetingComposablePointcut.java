package main.com.baobaotao.advisor;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * Created by qiangber on 17-4-12.
 */
public class GreetingComposablePointcut {
    public Pointcut getIntersectionPointcut() {
        ComposablePointcut cp = new ComposablePointcut();

        Pointcut p1 = new ControlFlowPointcut(WaiterDelegate.class, "service");

        NameMatchMethodPointcut p2 = new NameMatchMethodPointcut();
        p2.addMethodName("greetTo");

        return cp.intersection(p1).intersection((Pointcut) p2);
    }
}
