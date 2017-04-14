package main.com.baobaotao.advice;

import java.sql.SQLException;

/**
 * Created by qiangber on 17-4-11.
 */
public class ForumService {
    public void removeTopic(int topicId) {
        throw new RuntimeException("运行异常！");
    }

    public void removeForum(int forumId) throws Throwable {
        throw new SQLException("数据更新异常！");
    }

}
