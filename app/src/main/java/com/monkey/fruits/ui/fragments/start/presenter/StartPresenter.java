package com.monkey.fruits.ui.fragments.start.presenter;



import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.start.view.CheckView;

import javax.inject.Inject;

public class StartPresenter extends BasePresenter<CheckView> {

    private MainActivityRouter mainActivityRouter;

    @Inject
    StartPresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }


    public void showGame() {
        getView().showGame(mainActivityRouter);
    }



}
