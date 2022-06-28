package com.example.meuapp.TabsLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.databinding.FragmentTab2Binding
import com.example.meuapp.databinding.FragmentTab3Binding


class Tab3Fragment : Fragment() {


    private var binding: FragmentTab3Binding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTab3Binding.inflate(inflater,container,false)
        return binding?.root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}