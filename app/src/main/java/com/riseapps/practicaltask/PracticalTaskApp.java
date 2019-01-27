package com.riseapps.practicaltask;

import android.app.Application;

import com.riseapps.practicaltask.dagger.AppComponent;
import com.riseapps.practicaltask.dagger.DaggerAppComponent;
import com.riseapps.practicaltask.dagger.module.AppModule;
import com.riseapps.practicaltask.dagger.module.GlobalModule;
import com.riseapps.practicaltask.dagger.module.NetworkModule;

public class PracticalTaskApp extends Application {
    private static PracticalTaskApp instance;
    private AppComponent appComponent;

    public static PracticalTaskApp getInstance() {
        return instance;
    }

    public AppComponent getApplicationComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        initializeDagger();
    }

    private void initializeDagger() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .globalModule(new GlobalModule())
                .build();
    }
}