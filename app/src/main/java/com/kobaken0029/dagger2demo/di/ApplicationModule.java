package com.kobaken0029.dagger2demo.di;

import com.kobaken0029.dagger2demo.MyApplication;
import com.kobaken0029.dagger2demo.model.Nozomi;
import com.kobaken0029.dagger2demo.model.SchoolIdol;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final MyApplication mApplicaiton;

    public ApplicationModule(MyApplication application) {
        mApplicaiton = application;
    }

    @Provides
    @Singleton
    public SchoolIdol provideSchoolIdol() {
        return new Nozomi();
    }
}