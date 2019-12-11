package com.monkey.fruits.di.modules;

import com.monkey.fruits.di.scopes.ActivityScope;
import com.monkey.fruits.di.scopes.FragmentScope;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.routers.main.MainActivityRouterImpl;
import com.monkey.fruits.ui.fragments.logo.view.StartFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsFragment;
import com.monkey.fruits.ui.fragments.win.view.WinFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {
    @ActivityScope
    @Binds
    MainActivityRouter mainActivityRouter(MainActivityRouterImpl mainRouter);



    @FragmentScope
    @ContributesAndroidInjector
    StartFragment logoFragment();

    @FragmentScope
    @ContributesAndroidInjector
    MonkeyFruitsFragment gameFragment();

    @FragmentScope
    @ContributesAndroidInjector
    WinFragment winFragment();

}
