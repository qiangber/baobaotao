package main.com.baobaotao.introduce;

/**
 * Created by qiangber on 17-4-11.
 */
public class ForumService {
    public void removeTopic(int topicId) {
        System.out.println("模拟删除topic记录" + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void removeForum(int forumId) {
        System.out.println("模拟删除forum记录" + forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
