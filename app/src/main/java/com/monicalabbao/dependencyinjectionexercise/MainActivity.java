package com.monicalabbao.dependencyinjectionexercise;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.monicalabbao.dependencyinjectionexercise.di.NetworkUtil;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**Mga dependencies from AppModule na gagamitin mo. Para isahang declaration na lang*/
    @Inject
    NetworkUtil networkUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyApplication.get(this).getAppComponent().inject(this); //Alt-enter lang palagi para mag-inject ka ng bagong class;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
