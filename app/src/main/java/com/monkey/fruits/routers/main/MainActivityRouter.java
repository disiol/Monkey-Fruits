package com.monkey.fruits.routers.main;

public interface MainActivityRouter {

    void showLogoFragment();
    void showGameFragment();

    void showWinFragment(boolean flag, int points);

    void showWebFragment();
}
