package com.sanjay.weatherapp

import android.Manifest
import android.content.Intent
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


private const val PERMISSION_REQUEST = 10

class MainActivity : AppCompatActivity() {

    var tv_result: String = ""

    lateinit var locationManager: LocationManager
    private var hasGps = false
    private var hasNetwork = false
    private var locationGps: Location? = null
    private var locationNetwork: Location? = null
    private var permissions = arrayOf(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        search.setOnClickListener {
            val cityname = findViewById<EditText>(R.id.city_Name)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("CITY_NAME", cityname.text.toString())
            startActivity(intent)
        }


    }

}