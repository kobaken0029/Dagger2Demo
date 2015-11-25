package com.kobaken0029.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kobaken0029.dagger2demo.di.ApplicationModule;
import com.kobaken0029.dagger2demo.di.DaggerApplicationComponent;
import com.kobaken0029.dagger2demo.model.SchoolIdol;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SchoolIdol nozomi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule((MyApplication) getApplication()))
                .build()
                .inject(this);
        ((TextView)findViewById(R.id.lyrics_text)).setText(nozomi.sing("僕らは○の中で"));
        nozomi.joinLive(100000);
    }
}
