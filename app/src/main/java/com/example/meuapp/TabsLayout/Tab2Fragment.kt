package com.example.meuapp.TabsLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.databinding.FragmentTab1Binding
import com.example.meuapp.databinding.FragmentTab2Binding


class Tab2Fragment : Fragment() {

    private var binding: FragmentTab2Binding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTab2Binding.inflate(inflater,container,false)
        return binding?.root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}