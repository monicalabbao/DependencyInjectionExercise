package com.monicalabbao.dependencyinjectionexercise.di;

import android.net.ConnectivityManager;

public class NetworkUtil {
    private ConnectivityManager connectivityManager;

    public NetworkUtil(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }
}
