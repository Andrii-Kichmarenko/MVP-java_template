package com.andriikichmarenko.mvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.andriikichmarenko.mvp.di.ActivityContext;
import com.andriikichmarenko.mvp.di.PerActivity;
import com.andriikichmarenko.mvp.ui.splash.SplashActivity;
import com.andriikichmarenko.mvp.ui.splash.SplashMvpPresenter;
import com.andriikichmarenko.mvp.ui.splash.SplashMvpView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashMvpPresenter<SplashMvpView> presenter){
        return presenter;
    }

}
