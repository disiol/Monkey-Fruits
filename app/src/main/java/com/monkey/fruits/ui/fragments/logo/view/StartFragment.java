package com.monkey.fruits.ui.fragments.logo.view;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.monkey.fruits.databinding.StartBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.logo.presenter.LogoPresenter;
import com.monkey.fruits.R;

public class StartFragment extends BaseBindingFragment<LogoPresenter, StartBinding> implements CheckView {


    private CountDownTimer countDownTimer;

    @Override
    public int getLayoutResId() {
        return R.layout.start;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showProgress(binding.progressBar);

        countDownTimer = new CountDownTimer(3000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                presenter.showGame();
                hideProgress(binding.progressBar);
            }
        }.start();

    }


    @Override
    public void showGame(MainActivityRouter mainActivityRouter) {
        mainActivityRouter.showGameFragment();

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {
    }
}