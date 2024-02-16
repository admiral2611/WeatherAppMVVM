package com.admiral26.weatherappmvvm.core.di.component

import android.app.Application
import com.admiral26.weatherappmvvm.core.App
import com.admiral26.weatherappmvvm.core.di.modul.app.AppModule
import com.admiral26.weatherappmvvm.core.di.modul.network.NetworkModule
import com.admiral26.weatherappmvvm.core.di.modul.network.ServiceModule
import com.admiral26.weatherappmvvm.core.di.modul.repo.RepositoryModule
import com.admiral26.weatherappmvvm.core.di.modul.ui.BaseActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        NetworkModule::class,
        ServiceModule::class,
        RepositoryModule::class,
        BaseActivityModule::class
    ]
)
@Singleton
interface MyAppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Build {
        @BindsInstance
        fun context(app: Application): Build
        fun build(): MyAppComponent
    }
}