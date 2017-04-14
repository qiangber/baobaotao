package main.com.baobaotao.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * Created by qiangber on 17-4-6.
 */
public class ResourceExample {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/qiangber/IdeaProjects/baobaotao/target/classes/main/com/baobaotao/reflect/Car.class";
        Resource res1 = new FileSystemResource(filePath);
        Resource res2 = new ClassPathResource("main/com/baobaotao/reflect/Car.class");
        InputStream ins1 = res1.getInputStream();
        InputStream ins2 = res2.getInputStream();
        System.out.println(res1.getFilename());
        System.out.println(res2.getFilename());
        EncodedResource encRes = new EncodedResource(res2, "UTF-8");
        String content = FileCopyUtils.copyToString(encRes.getReader());
        System.out.println(content);
    }
}
