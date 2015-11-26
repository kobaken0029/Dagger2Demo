package com.kobaken0029.dagger2demo.di;

import android.app.Activity;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(Activity activity);
    Context context();
}
