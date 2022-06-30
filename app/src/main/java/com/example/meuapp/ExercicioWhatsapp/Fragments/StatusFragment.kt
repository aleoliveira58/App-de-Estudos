package com.example.meuapp.ExercicioWhatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentCallBinding
import com.example.meuapp.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    private var binding: FragmentStatusBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater,container,false)
        return binding?.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}