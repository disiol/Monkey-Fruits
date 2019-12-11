package com.monkey.fruits.ui.fragments.win.presenter;


import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.win.view.WinView;

import javax.inject.Inject;

public class WinPresenter extends BasePresenter<WinView> {

    private MainActivityRouter mainActivityRouter;

    @Inject
    WinPresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }


    public void newGame() {
        getView().newGame(mainActivityRouter);
    }


}
