package com.admiral26.weatherappmvvm.core.di.modul.repo

import com.admiral26.weatherappmvvm.core.network.WeatherService
import com.admiral26.weatherappmvvm.core.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {


    @[Provides Singleton]
    fun provideNewsRepository(service: WeatherService): WeatherRepository {
        return WeatherRepository(service)
    }
}