package com.monicalabbao.dependencyinjectionexercise;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Scheduler;

public class RandomUtilClass {

    @Inject
    @Named("io") //Pag may @Named ka, gamitin mo si @Named para mahanap niya
    Scheduler ioScheduler;

    public void doUtilThings(Context context){
        MyApplication.get(context).getAppComponent().inject(this);
    }
}
