package com.ljj.spring.ioc.chapter4;

/**
 * @Author liujj
 * @Description TODO
 * @Date 2019/9/2 18:32
 */

public class MyDataSource {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
