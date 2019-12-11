package com.monkey.fruits.ui.fragments.logo.presenter;



import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.logo.view.CheckView;

import javax.inject.Inject;

public class LogoPresenter extends BasePresenter<CheckView> {

    private MainActivityRouter mainActivityRouter;

    @Inject
    LogoPresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }


    public void showGame() {
        getView().showGame(mainActivityRouter);
    }



}
