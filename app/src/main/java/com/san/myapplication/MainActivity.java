package com.san.myapplication;

import android.arch.lifecycle.ViewModelProviders;
import android.content.pm.ActivityInfo;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.san.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LoginView{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this,new LoginModel())).get(LoginViewModel.class));
    }

    @Override
    public void onLoginSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onLoginError(String errMsg) {
        Toast.makeText(this, errMsg, Toast.LENGTH_SHORT).show();
    }
}
