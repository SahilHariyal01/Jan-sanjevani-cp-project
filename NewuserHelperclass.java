package com.example.jansanjivani;

import android.text.Editable;

class NewuserHelperclass {

    String name,user,pass ;

    public NewuserHelperclass(Editable name, Editable username, Editable pass) {

    }

    public NewuserHelperclass(String name, String user, String pass) {
        this.name = name;
        this.user = user;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}