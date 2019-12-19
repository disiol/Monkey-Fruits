package com.monkey.fruits.ui.fragments.start.view;


import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.monkey.fruits.databinding.StartBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.start.presenter.StartPresenter;
import com.monkey.fruits.R;

public class StartFragment extends BaseBindingFragment<StartPresenter, StartBinding> implements StartView {


    public static final String MY_FIRST_TIME = "my_first_time";
    public static final String SHOW_WEB_FRAGMENT = "showWebFragment";
    public static final String SHOW_GAME = "showGame";
    final String PREFS_NAME = "MyPrefsFile";
    final String PREFS = "forRanWeb";
    final String PREFS2 = "forRanGAme";
    private SharedPreferences forRanWeb;
    private SharedPreferences forRanGame;
    private boolean settingsBoolean;


    @Override
    public int getLayoutResId() {
        return R.layout.start;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        SharedPreferences settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
        forRanWeb = getActivity().getSharedPreferences(PREFS, 0);
        forRanGame = getActivity().getSharedPreferences(PREFS2, 0);

        settingsBoolean = settings.getBoolean(MY_FIRST_TIME, true);
        if (settingsBoolean) {
            //the app is being launched for first time, do something
            Log.d("Comments", "First time");

            // first time task
            showProgress(binding.progressBar);
            presenter.check();
            showProgress(binding.progressBar);

            // record the fact that the app has been started at least once
            settings.edit().putBoolean(MY_FIRST_TIME, false).apply();
            forRanWeb.edit().putBoolean(SHOW_WEB_FRAGMENT, false).apply();
            forRanGame.edit().putBoolean(SHOW_GAME, false).apply();


        } else {
            if (forRanWeb.getBoolean(SHOW_WEB_FRAGMENT, true)) {
                presenter.showWeb();
            } else if (forRanGame.getBoolean(SHOW_GAME, true)) {
                presenter.showGame();

            }

        }


    }


    @SuppressLint("CommitPrefEdits")
    @Override
    public void showWeb(MainActivityRouter mainActivityRouter) {
        forRanWeb.edit().putBoolean(SHOW_WEB_FRAGMENT, true).apply();
        mainActivityRouter.showWebFragment();
//        if (settingsBoolean) {
//            restartApp();
//        } else {
//
//
//        }

    }

    private void restartApp() {
        Intent mStartActivity = new Intent(getContext(), getActivity().getClass());
        int mPendingIntentId = 123456;
        PendingIntent mPendingIntent = PendingIntent.getActivity(getContext(), mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager mgr = (AlarmManager) getContext().getSystemService(Context.ALARM_SERVICE);
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
        getActivity().finish();
    }

    @Override
    public void showGame(MainActivityRouter mainActivityRouter) {
        forRanGame.edit().putBoolean(SHOW_GAME, true).apply();
        mainActivityRouter.showGameFragment();

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {
        forRanGame.edit().putBoolean(SHOW_GAME, true).apply();

        mainActivityRouter.showGameFragment();
    }
}