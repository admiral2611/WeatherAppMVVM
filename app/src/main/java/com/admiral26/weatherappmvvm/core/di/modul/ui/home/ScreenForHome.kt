package com.admiral26.weatherappmvvm.core.di.modul.ui.home

import com.admiral26.weatherappmvvm.core.di.modul.ui.vm.HomeViewModel
import com.admiral26.weatherappmvvm.ui.HomeScreen
import com.admiral26.weatherappmvvm.ui.Splash
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ScreenForHome  {

    @ContributesAndroidInjector(modules = [HomeViewModel::class])
    fun mainHom():HomeScreen

    @ContributesAndroidInjector
    fun mainSplash():Splash

}