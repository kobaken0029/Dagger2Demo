package com.kobaken0029.dagger2demo.di;

import android.support.v7.app.AppCompatActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    AppCompatActivity activity();
}