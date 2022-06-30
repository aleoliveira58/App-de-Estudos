package com.example.meuapp.NavigationBottom.Fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentHomeBinding



//android:screenOrientation="portrait" (Travar o app pra não girar o celular, fazer isso no mainfest onde esta a activity

class HomeFragment : Fragment() {

    private  var binding: FragmentHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btCadastro?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cadastroFragment)
        }

        binding?.btFiguras?.setOnClickListener {
            binding?.animationLoad?.isVisible = true
            Handler().postDelayed({
            findNavController().navigate(R.id.action_homeFragment_to_figurasFragment)
            }, 2000L)
        }


        binding?.btCalculadora?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_calculadoraImcFragment)
        }

        binding?.btExerciciosSocios?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_exercicioHomeFragment)
        }

        binding?.btTabsLayout?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_tabsFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

