package com.andriikichmarenko.mvp.ui.base;

import android.support.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void onError(String message);

    void showMessage(String message);

    boolean isNetworkConnected();

    void hideKeyboard();
}
