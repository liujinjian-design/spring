package com.ljj.spring.pattern;

public class UserServiceImpl implements UserService {
    @Override
    public void say(String content) {
        System.out.println(content);
    }
}
