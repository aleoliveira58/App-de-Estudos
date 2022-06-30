package com.example.meuapp.ExercicioSocio

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.edit
import androidx.navigation.fragment.findNavController
import com.example.meuapp.ExercicioSharedPreferense.HomeSharedActivity

import com.example.meuapp.NavigationBottom.Utils.getText
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
            Toast.makeText(context, "Cadastro feito com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}