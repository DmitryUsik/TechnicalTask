package com.riseapps.practicaltask.dagger.module;

import com.riseapps.practicaltask.PracticalTaskApp;
import com.riseapps.practicaltask.dagger.PerApp;
import com.riseapps.practicaltask.storage.preferences.Preferences;
import com.riseapps.practicaltask.storage.preferences.PreferencesImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class GlobalModule {
    @Provides
    @PerApp
    Preferences providePreferencesImpl(PracticalTaskApp practicalTaskApp) {
        return new PreferencesImpl(practicalTaskApp);
    }
}