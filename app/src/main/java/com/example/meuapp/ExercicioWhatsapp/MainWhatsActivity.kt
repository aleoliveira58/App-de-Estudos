package com.example.meuapp.ExercicioWhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.R
import com.example.meuapp.databinding.ActivityMainBinding
import com.example.meuapp.databinding.ActivityMainWhatsBinding

class MainWhatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainWhatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainWhatsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}