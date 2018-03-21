package com.example.dipto.daggerandrxjava.base;

import android.app.Activity;

import com.example.dipto.daggerandrxjava.di.ActivityScope;
import com.example.dipto.daggerandrxjava.home.MainActivity;
import com.example.dipto.daggerandrxjava.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Dipto on 3/21/2018.
 */

@Module(subcomponents = {
        MainActivityComponent.class,

})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
