package com.san.myapplication.progressBar;

import android.arch.lifecycle.ViewModel;
import android.view.View;

/**
 * Created by sandeep on 28/9/18.
 */

public class ProgressBarViewModel extends ViewModel {
    ProgressBarModel model;

    public ProgressBarViewModel(ProgressBarModel model) {
        this.model = model;
    }
    public void onButtonClickView(View view){
        if(model.isShowing()){
            model.setShowing(false);
            model.setButtonText("SHOW PROGRESS BAR");
        }else{
            model.setShowing(true);
            model.setButtonText("HIDE PROGRESS BAR");

        }
    }
}
