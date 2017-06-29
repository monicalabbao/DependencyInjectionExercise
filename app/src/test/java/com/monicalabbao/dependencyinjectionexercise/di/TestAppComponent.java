package com.monicalabbao.dependencyinjectionexercise.di;

import com.monicalabbao.dependencyinjectionexercise.BaseTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton //Pag may singleton sa modules mo, dapat singleton din si component
@Component(modules = {NetworkModule.class, TestModule.class})
public interface TestAppComponent {

    void inject(BaseTest baseTest);
}
