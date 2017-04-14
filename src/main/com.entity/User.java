package main.com.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiangber on 17-4-6.
 */
public class User {
    private Pet pet = new Pet();

    static class SingletonHolder {
        private static User instance = new User();
    }

    public static User getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        User.getInstance();
        User.getInstance();
    }
}
