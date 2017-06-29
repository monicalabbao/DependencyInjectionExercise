package com.monicalabbao.dependencyinjectionexercise.di;

import java.io.File;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    File cacheFile() {
        return new File("./blah");
    }
}
