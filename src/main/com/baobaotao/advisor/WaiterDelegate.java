package main.com.baobaotao.advisor;

/**
 * Created by qiangber on 17-4-12.
 */
public class WaiterDelegate {
    private Waiter waiter;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void service(String clientName) {
        waiter.greetTo(clientName);
        waiter.serveTo(clientName);
    }
}
