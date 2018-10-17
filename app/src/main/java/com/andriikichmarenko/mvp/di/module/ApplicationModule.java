package com.andriikichmarenko.mvp.di.module;

import android.app.Application;
import android.content.Context;

import com.andriikichmarenko.mvp.data.prefs.AppPreferencesHelper;
import com.andriikichmarenko.mvp.data.prefs.PreferencesHelper;
import com.andriikichmarenko.mvp.di.ApplicationContext;
import com.andriikichmarenko.mvp.di.PreferenceInfo;
import com.andriikichmarenko.mvp.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    // here you can implement provides methods for database, datamanager, api key, etc.

}