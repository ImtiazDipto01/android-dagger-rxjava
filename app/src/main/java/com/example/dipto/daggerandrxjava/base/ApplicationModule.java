package com.example.dipto.daggerandrxjava.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dipto on 3/7/2018.
 */

@Module
public class ApplicationModule {

    private Application application;

    ApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application ;
    }
}
