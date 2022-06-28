package com.example.meuapp.ExercicioSocio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.TabsLayout.ViewPagerAdapter
import com.example.meuapp.databinding.FragmentExercicioHomeBinding

class ExercicioHomeFragment : Fragment() {

    private var binding : FragmentExercicioHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExercicioHomeBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentsList = listOf(NoSocioFragment(), SocioFragment())
        val fragmentsTitleList = listOf("Não Sócio" , "Sócio")

        activity?.let {
            val viewPagerAdapter = ViewPagerAdapter(
                fragmentManager = childFragmentManager,
                fragmentsList = fragmentsList,
                fragmentsTitleList = fragmentsTitleList
            )
            binding?.let { bindingNonNull ->
                with(bindingNonNull) {
                    vpViewPageAdapterSocios.adapter = viewPagerAdapter
                    tlTabsSocios.setupWithViewPager(vpViewPageAdapterSocios)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}