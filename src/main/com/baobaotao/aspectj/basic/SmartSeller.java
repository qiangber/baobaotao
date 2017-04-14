package main.com.baobaotao.aspectj.basic;

/**
 * Created by qiangber on 17-4-13.
 */
public class SmartSeller implements Seller {
    @Override
    public void sell(String goods, String obj) {
        System.out.println("sells " + goods + " to " + obj);
    }
}
