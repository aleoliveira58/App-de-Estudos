package com.example.meuapp.ExercicioTestes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentBlankBinding
import com.example.meuapp.databinding.FragmentExercicioHomeBinding


class BlankFragment : Fragment() {

    private var binding : FragmentBlankBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btSaveTestes?.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_viewFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}