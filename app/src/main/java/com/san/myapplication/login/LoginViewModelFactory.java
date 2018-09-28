package com.san.myapplication.login;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

/**
 * Created by sandeep on 27/9/18.
 */

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginView view;
    private LoginModel model;

    public LoginViewModelFactory(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(view,model);
    }
}
