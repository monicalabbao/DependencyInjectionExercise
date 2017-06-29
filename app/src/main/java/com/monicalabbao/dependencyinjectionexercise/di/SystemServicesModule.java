package com.monicalabbao.dependencyinjectionexercise.di;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;

import com.monicalabbao.dependencyinjectionexercise.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemServicesModule {

    //kung gagamitin mo si Application class kay AppModule, si Application dapat gamitin mo.
    @Provides
    ConnectivityManager connectivityManager(Application application) {
        return (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    //Pwede maghiraman ng @Provides yung mga modules na kasali sa AppComponent

    @Singleton //Lifespan. Para isahang instantiation na lang. Pero ingat ka kasi persistent siya sa memory
    @Provides
    NetworkUtil networkUtil(ConnectivityManager connectivityManager) {
        return new NetworkUtil(connectivityManager);
    }
}
