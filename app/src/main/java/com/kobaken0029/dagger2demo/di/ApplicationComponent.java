package com.kobaken0029.dagger2demo.di;

import android.content.Context;

import com.kobaken0029.dagger2demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity activity);
    Context context();
}
