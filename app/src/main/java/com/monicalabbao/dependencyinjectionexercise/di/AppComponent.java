package com.monicalabbao.dependencyinjectionexercise.di;

import com.monicalabbao.dependencyinjectionexercise.MainActivity;
import com.monicalabbao.dependencyinjectionexercise.RandomUtilClass;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Ito yung bridge between yung dependencies and yung mga classes na gagamitin mo for this project*/
@Singleton //Kasi buhay ito hangga' buhay si app
@Component(modules = {AppModule.class, SystemServicesModule.class, NetworkModule.class}) //para ma-inject mo kada class yung need mo na ibang dependencies
public interface AppComponent {
    void inject(MainActivity mainActivity); //Classes na hihiram ng dependencies kay AppMNdule

    void inject(RandomUtilClass randomUtilClass); //Di lang acitivity pwede manghiram. Kahit anong class nga eh
}
