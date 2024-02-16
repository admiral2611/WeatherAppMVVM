package com.admiral26.weatherappmvvm.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.weatherappmvvm.R
import com.admiral26.weatherappmvvm.core.base.BaseFragment
import com.admiral26.weatherappmvvm.databinding.ScreenHomeBinding
import com.admiral26.weatherappmvvm.util.ViewModelProviderFactory
import javax.inject.Inject

class HomeScreen : BaseFragment(R.layout.screen_home_) {
    private val binding by viewBinding(ScreenHomeBinding::bind)

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    private val homeVM: HomeScreenVm by viewModels {
        providerFactory
    }

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        homeVM.getCurrentWeather("Moskva")

    }


}

