package com.admiral26.weatherappmvvm.core.di.modul.ui.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.admiral26.weatherappmvvm.ui.HomeScreenVm
import com.admiral26.weatherappmvvm.util.ViewModelProviderFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import uz.ibrokhimov.mynewsapi.core.util.ViewModelKey


@Module
interface HomeViewModel {

    @Binds
    fun bindViewModelFactory(factory:ViewModelProviderFactory):ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeScreenVm::class)
    fun bindMainViewModel(homeVM: HomeScreenVm): ViewModel
}