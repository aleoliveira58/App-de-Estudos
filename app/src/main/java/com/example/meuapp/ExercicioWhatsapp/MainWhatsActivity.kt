package com.example.meuapp.ExercicioWhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.ExercicioMusicas.Adapter.ViewPageAdapterMusicas
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterMain
import com.example.meuapp.ExercicioWhatsapp.Fragments.CallFragment
import com.example.meuapp.ExercicioWhatsapp.Fragments.CameraFragment
import com.example.meuapp.ExercicioWhatsapp.Fragments.ChatFragment
import com.example.meuapp.ExercicioWhatsapp.Fragments.StatusFragment
import com.example.meuapp.R
import com.example.meuapp.TabsLayout.ViewPagerAdapter
import com.example.meuapp.databinding.ActivityMainWhatsBinding

class MainWhatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainWhatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainWhatsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setUpTabs()


    }

    private fun setUpTabs() {
        val adapter = AdapterMain(supportFragmentManager)
        adapter.addFragment(CameraFragment(), "")
        adapter.addFragment(ChatFragment(), "CHAT")
        adapter.addFragment(StatusFragment(), "STATUS")
        adapter.addFragment(CallFragment(), "CALL")
        binding.viewPagerTabs.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPagerTabs)
        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_camera_black)

    }


}