package com.san.myapplication;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/**
 * Created by sandeep on 27/9/18.
 */

public class LoginViewModel extends ViewModel {
    private LoginView view;
    private LoginModel loginModel;

    public LoginViewModel(LoginView view, LoginModel loginModel) {
        this.view = view;
        this.loginModel = loginModel;
    }

    public TextWatcher getEmailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setEmail(editable.toString());
            }
        };
    }
    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setPassword(editable.toString());
            }
        };
    }

    public void onLoginButtonClick(View mView){
        int code = loginModel.getLoginErrorOrSuccessCode();
        switch (code){
            case 1:
                view.onLoginError("error");
                break;
            case -1:
                view.onLoginSuccess("Sucess");
                break;
        }
    }
}
