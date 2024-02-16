package com.admiral26.weatherappmvvm.core.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import dagger.android.support.DaggerFragment

abstract class BaseFragment(@LayoutRes view:Int):DaggerFragment(view) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onCreated(view, savedInstanceState)
    }

    abstract fun onCreated(view: View, savedInstanceState: Bundle?)
}