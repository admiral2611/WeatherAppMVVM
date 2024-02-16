package com.admiral26.weatherappmvvm.core

import android.app.Application
import com.admiral26.weatherappmvvm.core.di.component.DaggerMyAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

     override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
         return DaggerMyAppComponent.builder().context(this).build()
     }
}