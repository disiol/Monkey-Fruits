package com.monkey.fruits.di.modules;

import android.content.Context;

import com.monkey.fruits.manedger.PreferencesManager;
import com.monkey.fruits.manedger.PreferencesManagerImpl;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ManagersModule {

    @Provides
    @Singleton
    PreferencesManager providePreferencesManager(Context context){
        return new PreferencesManagerImpl(context);
    }


}
