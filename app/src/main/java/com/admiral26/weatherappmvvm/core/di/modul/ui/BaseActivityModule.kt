package com.admiral26.weatherappmvvm.core.di.modul.ui

import com.admiral26.weatherappmvvm.MainActivity
import com.admiral26.weatherappmvvm.core.di.modul.ui.home.ScreenForHome
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BaseActivityModule {
    @ContributesAndroidInjector(modules = [ScreenForHome::class])
    abstract fun mainActivity():MainActivity
}