package com.example.meuapp.ExercicioSocio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentNoSocioBinding
import com.example.meuapp.databinding.FragmentSocioBinding

class SocioFragment : Fragment() {

    private var binding : FragmentSocioBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSocioBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btOpen?.setOnClickListener {
            Toast.makeText(context, "Bem-vindo de volta!", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}