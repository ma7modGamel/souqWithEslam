package com.safwatech.Souq

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View.GONE
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.safwatech.Souq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        binding=ActivityMainBinding.inflate(layoutInflater)
        initSplash()

        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }


    private fun   initSplash() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
        } else {
           setTheme(R.style.Theme_Souq)
        }
    }

}