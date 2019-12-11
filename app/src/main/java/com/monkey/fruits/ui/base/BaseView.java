package com.monkey.fruits.ui.base;

import android.widget.ProgressBar;

import com.monkey.fruits.routers.main.MainActivityRouter;

public interface BaseView {

    void showProgress(ProgressBar progressBar);

    void hideProgress(ProgressBar progressBar);

    void showMessage(String message);

    void showError(Throwable throwable, MainActivityRouter mainActivityRouter);
}
