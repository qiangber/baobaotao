package main.com.baobaotao.advice;

/**
 * Created by qiangber on 17-4-11.
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
