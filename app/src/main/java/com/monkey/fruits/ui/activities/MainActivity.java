package com.monkey.fruits.ui.activities;


import android.os.Bundle;

import com.monkey.fruits.manedger.PreferencesManager;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseActivity;
import com.monkey.fruits.R;


import javax.inject.Inject;


public class MainActivity extends BaseActivity {

    @Inject
    MainActivityRouter mainActivityRouter;
    @Inject
    PreferencesManager preferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityRouter.showLogoFragment();

    }


}
