package com.monkey.fruits.di.modules;

import com.google.gson.Gson;
import com.monkey.fruits.api.Api;
import com.monkey.fruits.interactor.DataStore;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    DataStore provideDataStore(Api api, Gson gson) {
        return new DataStore(api, gson);
    }
}
