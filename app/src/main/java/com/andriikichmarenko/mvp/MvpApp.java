package com.andriikichmarenko.mvp;

import android.app.Application;

import com.andriikichmarenko.mvp.di.component.ApplicationComponent;
import com.andriikichmarenko.mvp.di.component.DaggerApplicationComponent;
import com.andriikichmarenko.mvp.di.module.ApplicationModule;
import com.androidnetworking.AndroidNetworking;

public class MvpApp extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AndroidNetworking.initialize(getApplicationContext());
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
