package com.riseapps.practicaltask.dagger.module;

import com.riseapps.practicaltask.PracticalTaskApp;
import com.riseapps.practicaltask.dagger.PerApp;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private PracticalTaskApp practicalTaskApp;

    public AppModule(PracticalTaskApp practicalTaskApp) {
        this.practicalTaskApp = practicalTaskApp;
    }

    @Provides
    @PerApp
    PracticalTaskApp providePracticalTaskApp() {
        return practicalTaskApp;
    }
}