package main.com.baobaotao.aspectj.anno;

/**
 * Created by qiangber on 17-4-13.
 */
public class ForumService {
    @NeedTest
    public void removeTopic(int topicId) {
        System.out.println("模拟删除topic记录" + topicId);
    }

    @NeedTest
    public void removeForum(int forumId) {
        System.out.println("模拟删除forum记录" + forumId);
    }
}
