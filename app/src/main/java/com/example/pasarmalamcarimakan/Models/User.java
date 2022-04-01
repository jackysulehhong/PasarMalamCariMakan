package com.example.pasarmalamcarimakan.Models;

public class User {
    public String email,password;

    public User(String email, String password, String userid) {

        this.email = email;
        this.password = password;

    }

    public User(){

    }





    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
