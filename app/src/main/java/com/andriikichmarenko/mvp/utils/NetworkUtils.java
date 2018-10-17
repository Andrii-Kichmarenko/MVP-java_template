package com.andriikichmarenko.mvp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.andriikichmarenko.mvp.ui.base.BaseActivity;

public final class NetworkUtils {

    private NetworkUtils() {
        // This utility class is not publicly instantiable
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connMan=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = connMan.getActiveNetworkInfo();
        if (network == null || !network.isConnected()) {
            ((BaseActivity)context).showMessage("Please check your internet connection");
            return false;
        }
        return true;
    }
}
