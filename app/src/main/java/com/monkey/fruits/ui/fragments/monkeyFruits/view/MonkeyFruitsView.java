package com.monkey.fruits.ui.fragments.monkeyFruits.view;


import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseView;

public interface MonkeyFruitsView extends BaseView {


    void showEndGame(MainActivityRouter mainActivityRouter, boolean flag, int points);

    void setPoints(int points);

    void setLifesLeft(int lifes);
}
