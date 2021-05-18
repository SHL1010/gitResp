package com.shl.bean;

/**
 * @Auther: shl
 * @Date: 2021/5/17 - 05 - 17 - 10:34 下午
 * @Description: com.shl.bean
 * @version: 1.0
 */
public class User {

    private Integer userid;
    private String username;
    private String password;

    public User() {
        System.out.println("noAgrConstructor");

    }

    public User(Integer userid, String username, String password) {
        System.out.println("allAgrConstructor");
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        System.out.println("setUserid");
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("setUsername");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("setPassword");
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
