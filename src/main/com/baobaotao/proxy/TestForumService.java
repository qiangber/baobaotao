package main.com.baobaotao.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by qiangber on 17-4-11.
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService target = new ForumServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService proxyService = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        proxyService.removeForum(1);
        proxyService.removeTopic(2);

        CglibProxy cglibProxy = new CglibProxy();
        ForumService cglibService = (ForumService) cglibProxy.getProxy(target.getClass());
        cglibService.removeForum(3);
        cglibService.removeTopic(4);
    }

}
