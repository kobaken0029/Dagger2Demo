package com.kobaken0029.dagger2demo;

import dagger.Module;

@Module
public class ApplicationModule {
    private final MyApplication mApplicaiton;

    public ApplicationModule(MyApplication application) {
        mApplicaiton = application;
    }
}