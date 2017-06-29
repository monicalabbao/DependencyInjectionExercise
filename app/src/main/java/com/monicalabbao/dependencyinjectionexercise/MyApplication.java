package com.monicalabbao.dependencyinjectionexercise;

import android.app.Application;
import android.content.Context;
import android.support.annotation.VisibleForTesting;

import com.monicalabbao.dependencyinjectionexercise.di.AppComponent;
import com.monicalabbao.dependencyinjectionexercise.di.AppModule;
import com.monicalabbao.dependencyinjectionexercise.di.DaggerAppComponent;


public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize mo si AppComponent. Pero build mo muna yung project
        //In fact, basta may binabago kana may @Component/@Module, build mo muna si Project
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)) //wag mo alahanin yung deprecated
                .build();
        AppComponent appComponent = this.appComponent;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @VisibleForTesting //di naman ginagamit for normal build
    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
}
