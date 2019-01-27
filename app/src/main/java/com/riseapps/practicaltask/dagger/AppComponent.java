package com.riseapps.practicaltask.dagger;

import com.riseapps.practicaltask.dagger.module.AppModule;
import com.riseapps.practicaltask.dagger.module.GlobalModule;
import com.riseapps.practicaltask.dagger.module.NetworkModule;

import dagger.Component;

@PerApp
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        GlobalModule.class
})
public interface AppComponent {
}