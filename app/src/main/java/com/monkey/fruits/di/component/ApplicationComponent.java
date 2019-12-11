package com.monkey.fruits.di.component;

import android.content.Context;

import com.monkey.fruits.MankeyFruits;
import com.monkey.fruits.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        ApplicationComponent build();
    }

    void inject(MankeyFruits mankeyFruits);
}
