package com.monkey.fruits.ui.fragments.win.view;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentLogoBinding;
import com.monkey.fruits.databinding.FragmentWinBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.win.presenter.WinPresenter;

public class WinFragment extends BaseBindingFragment<WinPresenter, FragmentWinBinding> implements WinView {


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_win;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonNewGame.setOnClickListener(v -> {
            presenter.newGame();
        });
        binding.buttonExit.setOnClickListener(v -> {
           exitGame();
        });


    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {
    }

    @Override
    public void newGame(MainActivityRouter mainActivityRouter) {
        mainActivityRouter.showGameFragment();

    }


    public void exitGame() {
        getActivity().finish();
    }
}