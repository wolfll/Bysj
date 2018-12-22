package com.Spring.Model;

public class UserModel {

    private  String id;
    private  String password;
    private  String unicode;//验证码


    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }
}
