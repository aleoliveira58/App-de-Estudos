package com.example.meuapp.ExercicioMusicas.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.ExercicioMusicas.Adapter.ViewPageAdapterMusicas
import com.example.meuapp.ExercicioMusicas.Fragments.AlbunsFragment
import com.example.meuapp.ExercicioMusicas.Fragments.ImagensFragment
import com.example.meuapp.ExercicioMusicas.Fragments.MusicasFragment
import com.example.meuapp.ExercicioMusicas.Model.ImagensModel
import com.example.meuapp.R
import com.example.meuapp.TabsLayout.ViewPagerAdapter
import com.example.meuapp.databinding.ActivitySplashBinding
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragments = listOf(MusicasFragment(), ImagensFragment(), AlbunsFragment())
        val fragmentsPageTitle = listOf("Músicas", "Imagens", "Álbuns")
        val viewPageAdapterMusicas = ViewPageAdapterMusicas(
            fragmentManager = supportFragmentManager,
            fragmentsList = fragments,
            fragmentsTitleList = fragmentsPageTitle
        )





        with(binding) {
            vpExercicioMusicas.adapter = viewPageAdapterMusicas
            tlExercicioMusicas.setupWithViewPager(vpExercicioMusicas)

        }

    }
}