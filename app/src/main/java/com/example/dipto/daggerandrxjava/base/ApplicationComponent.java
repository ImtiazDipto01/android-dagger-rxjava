package com.example.dipto.daggerandrxjava.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Dipto on 3/7/2018.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
})
public class ApplicationComponent {


}
