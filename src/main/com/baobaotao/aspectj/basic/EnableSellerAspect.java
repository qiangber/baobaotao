package main.com.baobaotao.aspectj.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by qiangber on 17-4-13.
 */
@Aspect
public class EnableSellerAspect {
    @DeclareParents(value = "main.com.baobaotao.aspectj.NaiveWaiter", defaultImpl = SmartSeller.class)
    public static Seller seller;
}
