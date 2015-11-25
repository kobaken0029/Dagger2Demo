package com.kobaken0029.dagger2demo;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(Activity activity);
}
