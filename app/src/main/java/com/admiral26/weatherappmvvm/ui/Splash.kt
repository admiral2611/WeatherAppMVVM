package com.admiral26.weatherappmvvm.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.weatherappmvvm.R
import com.admiral26.weatherappmvvm.core.base.BaseFragment
import com.admiral26.weatherappmvvm.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splash:BaseFragment(R.layout.fragment_splash) {
    private val binding by viewBinding(FragmentSplashBinding::bind)

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        lifecycleScope.launch {
            delay(5000)
            findNavController().navigate(SplashDirections.actionSplashToHomeScreen())
        }

    }
}