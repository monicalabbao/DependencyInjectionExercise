package com.monicalabbao.dependencyinjectionexercise;

import com.monicalabbao.dependencyinjectionexercise.di.ApiService;
import com.monicalabbao.dependencyinjectionexercise.di.NetworkModule;
import com.monicalabbao.dependencyinjectionexercise.di.TestAppComponent;
import com.monicalabbao.dependencyinjectionexercise.di.TestModule;
import com.monicalabbao.dependencyinjectionexercise.di.DaggerTestAppComponent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import timber.log.Timber;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**Ang abstract class ay parang template. Hybrid siya ng interface at superclass */
public abstract class BaseTest {

    @Inject
    ApiService apiService;

    @Before
    public void setUpLogging(){
        Timber.plant(new Timber.Tree() {
            @Override
            protected void log(int priority, String tag, String message, Throwable t) {
                System.out.print(message);
            }
        });
    }

    @Before
    public void setup() throws Exception {
        //Don't worry, na-generate pa rin si DaggerTestAppComponent. Explicit mo lang i-import tas
        // Hahanapin mo nga lang.
        TestAppComponent testAppComponent = DaggerTestAppComponent.builder()
                .testModule(new TestModule())
                .networkModule(new NetworkModule())
                .build();

//        testAppComponent.inject(this);
        injectDependencies(testAppComponent);
    }

    public abstract void injectDependencies(TestAppComponent testAppComponent);
}
