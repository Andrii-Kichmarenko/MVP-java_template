package com.andriikichmarenko.mvp.di.component;

import com.andriikichmarenko.mvp.di.PerActivity;
import com.andriikichmarenko.mvp.di.module.ActivityModule;
import com.andriikichmarenko.mvp.ui.splash.SplashActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);

}
