package com.example.meuapp.ExercicioWhatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentCadastroBinding
import com.example.meuapp.databinding.FragmentCallBinding


class CallFragment : Fragment() {

    private var binding: FragmentCallBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCallBinding.inflate(inflater,container,false)
        return binding?.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}