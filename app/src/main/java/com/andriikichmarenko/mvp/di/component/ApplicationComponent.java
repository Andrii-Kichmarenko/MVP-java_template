package com.andriikichmarenko.mvp.di.component;

import android.app.Application;
import android.content.Context;

import com.andriikichmarenko.mvp.MvpApp;
import com.andriikichmarenko.mvp.di.ApplicationContext;
import com.andriikichmarenko.mvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();
}
