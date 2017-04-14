package main.com.baobaotao.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * Created by qiangber on 17-4-6.
 */
public class PatternResolverTest {
    public static void main(String[] args) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource[] resources = resolver.getResources("classpath*:/**/*.xml");
            for (Resource resource :
                    resources) {
                System.out.println(resource.getDescription());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
