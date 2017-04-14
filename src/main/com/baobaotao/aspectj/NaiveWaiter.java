package main.com.baobaotao.aspectj;

import main.com.baobaotao.advice.Waiter;

/**
 * Created by qiangber on 17-4-11.
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("NaiveWaiter: greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("NaiveWaiter: serve to " + name);
    }
}
