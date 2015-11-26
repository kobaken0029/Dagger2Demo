package com.kobaken0029.dagger2demo.di;

import android.content.Context;

import com.kobaken0029.dagger2demo.MyApplication;
import com.kobaken0029.dagger2demo.model.Nozomi;
import com.kobaken0029.dagger2demo.model.SchoolIdol;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final MyApplication mApplication;

    public ApplicationModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    public SchoolIdol provideSchoolIdol() {
        return new Nozomi();
    }
}