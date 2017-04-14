package main.com.baobaotao.proxy;

/**
 * Created by qiangber on 17-4-11.
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("begin monitor");
        performanceRecord.set(new MethodPerformance(method));
    }

    public static void end() {
        System.out.println("end monitor");
        performanceRecord.get().printPerformance();
    }
}
