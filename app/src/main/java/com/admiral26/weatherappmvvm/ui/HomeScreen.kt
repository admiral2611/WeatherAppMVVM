package com.admiral26.weatherappmvvm.ui

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.location.LocationRequest
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.weatherappmvvm.R
import com.admiral26.weatherappmvvm.core.base.BaseFragment
import com.admiral26.weatherappmvvm.databinding.ScreenHomeBinding
import com.admiral26.weatherappmvvm.util.ViewModelProviderFactory
import com.admiral26.weatherappmvvm.util.iconFor
import com.bumptech.glide.Glide
import javax.inject.Inject

class HomeScreen : BaseFragment(R.layout.screen_home_), LocationListener {
    lateinit var locationManager: LocationManager
    private var forLocation = true

    private val binding by viewBinding(ScreenHomeBinding::bind)


    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    private val homeVM: HomeScreenVm by viewModels {
        providerFactory
    }

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        action()
        observe()
        getLocation()
        isLocationPermissionGranted()
    }


    private fun getLocation() {
        locationManager = activity?.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        if ((ContextCompat.checkSelfPermission(
                requireActivity(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED)
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                101
            )
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5f, this)
    }


    private fun action() {
        binding.sendLocation.setOnClickListener {
            val city = binding.searchEt.text.toString()
            homeVM.getCurrentWeather(city)
        }
    }

    private fun observe() {
        homeVM.weatherCurrentLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                binding.titleCity.text = it.location.region
                binding.imageView.iconFor(it.current.condition.icon)
                binding.tempratura.text = it.current.tempC.toString()
                binding.unitWeath.visibility = View.VISIBLE
                binding.progres.visibility=View.GONE
                forLocation = false
            }
        }
    }

    private fun isLocationPermissionGranted(): Boolean {
        return if (ActivityCompat.checkSelfPermission(
                requireActivity(),
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireActivity(),
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    android.Manifest.permission.ACCESS_FINE_LOCATION,
                    android.Manifest.permission.ACCESS_COARSE_LOCATION
                ), 101
            )
            false
        } else {
            true
        }
    }

    override fun onLocationChanged(location: Location) {
        Log.d("admm", "onLocationChanged: ${location.latitude}")
        Log.d("admm", "onLocationChanged: ${location.longitude}")
        homeVM.getCurrentWeather("${location.latitude},${location.longitude}")
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 101) {
            if (grantResults.isEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(requireActivity(), "Permission Granted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireActivity(), "Permission Dennied", Toast.LENGTH_SHORT).show()

            }

        }

    }
}




