package com.san.myapplication.login;

/**
 * Created by sandeep on 27/9/18.
 */

public interface LoginView {
   void onLoginSuccess(String msg);
   void onLoginError(String errMsg);
}
