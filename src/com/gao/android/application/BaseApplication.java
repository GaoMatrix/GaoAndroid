package com.gao.android.application;

import android.app.Application;
import android.content.Context;

import com.gao.android.exception.CrashHandler;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class BaseApplication extends Application {

    public Context sApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext = getApplicationContext();
        Thread.setDefaultUncaughtExceptionHandler(CrashHandler.getInstance());

        // Initialize ImageLoader with default configuration.
        ImageLoader.getInstance().init(
                ImageLoaderConfiguration.createDefault(this));
    }

    @Override
    public void onTerminate() {
        ImageLoader.getInstance().destroy();
        super.onTerminate();
    }
}
