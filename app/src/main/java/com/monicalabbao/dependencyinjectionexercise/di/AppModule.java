package com.monicalabbao.dependencyinjectionexercise.di;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;

import com.monicalabbao.dependencyinjectionexercise.MyApplication;

import java.io.File;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**Dito lahat ng dependencies mo*/
@Module //kasi module siya
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides //para malaman ni Dagger na dependency siya na ishe-share mo
    public Application getApplication() {
        return application;
    }

    /**Gamitin mo pag nagsche-schedulers ka sa RXJava*/
    @Provides
    @Named("io")
    Scheduler ioScheduler() {
        return Schedulers.io();
    }

    @Provides
    @Named("main")
    Scheduler mainScheduler() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    File cacheFile() {
        return application.getCacheDir();
    }
}
