package com.mashibing.returnjson;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/13
 */
public class UserInfo {
    private String name;
    private String avatar = "/avator2.jpg";
    private Permissions role;

    public UserInfo() {
    }

    public UserInfo(String name, String avatar, Permissions role) {
        this.name = name;
        this.avatar = avatar;
        this.role = role;
    }

    public UserInfo(String name, Permissions role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Permissions getRole() {
        return role;
    }

    public void setRole(Permissions role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                '}';
    }
}
