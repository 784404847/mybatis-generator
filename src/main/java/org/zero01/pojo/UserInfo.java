package org.zero01.pojo;

public class UserInfo {
    private Long userId;

    private String userName;

    private String telphone;

    private String sex;

    public UserInfo(Long userId, String userName, String telphone, String sex) {
        this.userId = userId;
        this.userName = userName;
        this.telphone = telphone;
        this.sex = sex;
    }

    public UserInfo() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}