package com.example.meuapp.ExercicioSharedPreferense

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.meuapp.databinding.ActivityAnimaisBinding
import com.example.meuapp.databinding.ActivitySplashScreenSharedBinding

class SplashScreenSharedActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenSharedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenSharedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            startActivity(Intent(this@SplashScreenSharedActivity, HomeSharedActivity:: class.java))
            finish()
        },  5000L)
    }
}