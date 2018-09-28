package com.san.myapplication.progressBar;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.san.myapplication.R;
import com.san.myapplication.databinding.ActivityProgressBarBinding;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProgressBarBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_progress_bar);
        ProgressBarModel model = new ProgressBarModel();
        model.setShowing(false);
        model.setButtonText("SHOW PROGRESS BAR");
        binding.setViewModel(ViewModelProviders.of(this,
                new ProgessBarViewModelFactory(model)).get(ProgressBarViewModel.class));
        binding.setModel(model);

    }
}
