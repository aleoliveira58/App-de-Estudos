package com.example.meuapp.ExercicioTestes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.databinding.ActivityListaAlunosBinding
import com.example.meuapp.databinding.ActivityTestesBinding

class TestesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}