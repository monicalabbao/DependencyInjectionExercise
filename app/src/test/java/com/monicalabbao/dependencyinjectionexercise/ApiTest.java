package com.monicalabbao.dependencyinjectionexercise;

import com.monicalabbao.dependencyinjectionexercise.di.TestAppComponent;

import org.junit.After;
import org.junit.Test;

import timber.log.Timber;

public class ApiTest extends BaseTest {
    @Override
    public void injectDependencies(TestAppComponent testAppComponent) {
        testAppComponent.inject(this);
    }
    @Test
    public void testinjectApiTest() throws Exception {
        apiService.generateToken("Bearer bleppity").blockingGet();
    }

    @After
    public void tearDown() throws Exception {
        Timber.uprootAll();
    }
}
