package com.san.myapplication.login;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by sandeep on 27/9/18.
 */

public class LoginModel{
    private String email;
    private String password;

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

    public int getLoginErrorOrSuccessCode(){
        if(TextUtils.isEmpty(getEmail())){
            return 1;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 2;
        }else if(TextUtils.isEmpty(getPassword())){
            return 3;
        }else if(getPassword().length()<6){
            return 4;
        }else {
            return -1;
        }
    }
}
