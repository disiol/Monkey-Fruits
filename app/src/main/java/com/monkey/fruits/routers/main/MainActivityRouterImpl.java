package com.monkey.fruits.routers.main;

import android.os.Bundle;

import com.monkey.fruits.routers.base.BaseRouter;
import com.monkey.fruits.ui.activities.MainActivity;
import com.monkey.fruits.ui.fragments.endGame.view.EndGameFragment;
import com.monkey.fruits.ui.fragments.start.view.StartFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsFragment;
import com.monkey.fruits.R;
import com.monkey.fruits.ui.fragments.web.view.WebFragment;

import javax.inject.Inject;

import static com.monkey.fruits.ui.fragments.endGame.view.EndGameFragment.POINTS;
import static com.monkey.fruits.ui.fragments.endGame.view.EndGameFragment.WIN;

public class MainActivityRouterImpl extends BaseRouter<MainActivity> implements MainActivityRouter {


    @Inject
    MainActivityRouterImpl(MainActivity activity) {
        super(activity);
    }

    @Override
    public void showGameFragment() {
        if (!isCurrentFragment(R.id.fragment_container, MonkeyFruitsFragment.class)) {
            replaceFragment(R.id.fragment_container, new MonkeyFruitsFragment());
        }
    }

    @Override
    public void showWinFragment(boolean flag, int points) {
        if (!isCurrentFragment(R.id.fragment_container, EndGameFragment.class)) {
            Bundle fragmentBundle = new Bundle();
            fragmentBundle.putBoolean(WIN, flag);
            fragmentBundle.putString(POINTS, String.valueOf(points));

            EndGameFragment fragment = new EndGameFragment();
            fragment.setArguments(fragmentBundle);
            replaceFragment(R.id.fragment_container, fragment);
        }
    }

    @Override
    public void showLogoFragment() {
        if (!isCurrentFragment(R.id.fragment_container, StartFragment.class)) {
            replaceFragment(R.id.fragment_container, new StartFragment());
        }
    }
    @Override
    public void showWebFragment() {
        if(!isCurrentFragment(R.id.fragment_container, WebFragment.class)) {
            replaceFragment(R.id.fragment_container, new WebFragment());
        }
    }

}
