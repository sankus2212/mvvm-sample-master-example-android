package com.san.myapplication.progressBar;

import android.databinding.BaseObservable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by sandeep on 28/9/18.
 */

public class ProgressBarModel extends BaseObservable {
    private boolean isShowing;
    private String buttonText;

    public boolean isShowing() {
        return isShowing;
    }

    public void setShowing(boolean showing) {
        isShowing = showing;
        notifyPropertyChanged(BR._all);
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
        notifyPropertyChanged(BR._all);
    }
}
