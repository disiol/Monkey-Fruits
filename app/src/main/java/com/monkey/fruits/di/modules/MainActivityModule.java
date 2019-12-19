package com.monkey.fruits.di.modules;

import com.monkey.fruits.di.scopes.ActivityScope;
import com.monkey.fruits.di.scopes.FragmentScope;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.routers.main.MainActivityRouterImpl;
import com.monkey.fruits.ui.fragments.endGame.view.EndGameFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsFragment;
import com.monkey.fruits.ui.fragments.start.view.StartFragment;
import com.monkey.fruits.ui.fragments.web.view.WebFragment;

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
    WebFragment webFragment();

    @FragmentScope
    @ContributesAndroidInjector
    StartFragment logoFragment();

    @FragmentScope
    @ContributesAndroidInjector
    MonkeyFruitsFragment gameFragment();

    @FragmentScope
    @ContributesAndroidInjector
    EndGameFragment winFragment();

}
