package com.example.jansanjivani;

public class users {

    public users(){
    }

    public users(String name, String pass, String user) {
        this.name = name;
        this.user = user;
        this.pass = pass;
    }

    private String name,user,pass ;

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
