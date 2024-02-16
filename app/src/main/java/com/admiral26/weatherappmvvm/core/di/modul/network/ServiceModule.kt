package com.admiral26.weatherappmvvm.core.di.modul.network

import com.admiral26.weatherappmvvm.core.network.WeatherService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
object ServiceModule {
    @[Provides Singleton]
fun provideWeatherService(retrofit: Retrofit):WeatherService{
 return retrofit.create(WeatherService::class.java)
}
}