package com.monkey.fruits.ui.fragments.endGame.presenter;


import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.endGame.view.EndGameView;

import javax.inject.Inject;

public class endGamePresenter extends BasePresenter<EndGameView> {

    private MainActivityRouter mainActivityRouter;

    @Inject
    endGamePresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }


    public void newGame() {
        getView().newGame(mainActivityRouter);
    }


}
