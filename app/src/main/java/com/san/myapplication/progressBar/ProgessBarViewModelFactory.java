package com.san.myapplication.progressBar;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

/**
 * Created by sandeep on 28/9/18.
 */

public class ProgessBarViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    ProgressBarModel model;

    public ProgessBarViewModelFactory(ProgressBarModel model) {
        this.model = model;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new ProgressBarViewModel(model);
    }
}
