package com.monkey.fruits.ui.fragments.endGame.view;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentEndGameBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.endGame.presenter.endGamePresenter;

public class EndGameFragment extends BaseBindingFragment<endGamePresenter, FragmentEndGameBinding> implements EndGameView {


    private boolean winGame;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_end_game;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if(!winGame){
            binding.textView.setText("GAME OVER");
        }

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