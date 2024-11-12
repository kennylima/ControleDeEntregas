package com.example.controledeentregas.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.controledeentregas.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Adiciona um marcador e move a câmera
        val location = LatLng(-22.2, -43.1)
        mMap.addMarker(MarkerOptions().position(location).title("Localização"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 10f))
    }
}