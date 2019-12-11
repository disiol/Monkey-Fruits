package com.monkey.fruits.routers.main;

import com.monkey.fruits.routers.base.BaseRouter;
import com.monkey.fruits.ui.activities.MainActivity;
import com.monkey.fruits.ui.fragments.logo.view.StartFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsFragment;
import com.monkey.fruits.R;
import com.monkey.fruits.ui.fragments.win.view.WinFragment;

import javax.inject.Inject;

public class MainActivityRouterImpl extends BaseRouter<MainActivity> implements MainActivityRouter {

    @Inject
    MainActivityRouterImpl(MainActivity activity) {
        super(activity);
    }

    @Override
    public void showGameFragment() {
        if(!isCurrentFragment(R.id.fragment_container, MonkeyFruitsFragment.class)) {
            replaceFragment(R.id.fragment_container, new MonkeyFruitsFragment());
        }
    }

    @Override
    public void showWinFragment() {
        if(!isCurrentFragment(R.id.fragment_container, WinFragment.class)) {
            replaceFragment(R.id.fragment_container, new WinFragment());
        }
    }

    @Override
    public void showLogoFragment() {
        if(!isCurrentFragment(R.id.fragment_container, StartFragment.class)) {
            replaceFragment(R.id.fragment_container, new StartFragment());
        }
    }


}
