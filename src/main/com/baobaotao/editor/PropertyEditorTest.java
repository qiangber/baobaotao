package main.com.baobaotao.editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiangber on 17-4-10.
 */
public class PropertyEditorTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/com/baobaotao/editor/beans.xml");
        Boss boss = (Boss) ctx.getBean("boss");
        System.out.println(boss);
    }
}
