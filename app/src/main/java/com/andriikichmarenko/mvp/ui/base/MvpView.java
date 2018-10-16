package com.andriikichmarenko.mvp.ui.base;

import android.support.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void onError(String message);

    void onError(@StringRes int resId);

    void showMessage(String message);

    void showMessage(int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
