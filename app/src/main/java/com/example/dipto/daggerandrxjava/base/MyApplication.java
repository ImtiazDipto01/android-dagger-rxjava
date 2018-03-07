package com.example.dipto.daggerandrxjava.base;

import android.app.Application;

/**
 * Created by Dipto on 3/7/2018.
 */

public class MyApplication extends Application {

    private ApplicationComponent component ;
    @Override
    public void onCreate() {
        super.onCreate();
        /*component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();*/
    }

}
