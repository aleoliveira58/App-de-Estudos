package com.example.meuapp.NavigationBottom.Fragment

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.meuapp.databinding.FragmentFigurasBinding


class FigurasFragment : Fragment() {

    private var binding: FragmentFigurasBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFigurasBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //Fazer animação sumir depois do tempo dela
        binding?.cartaEmail?.addAnimatorListener(object: Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {
                //
            }

            override fun onAnimationEnd(p0: Animator?) {
                binding?.cartaEmail?.isVisible = false
            }

            override fun onAnimationCancel(p0: Animator?) {
                //
            }

            override fun onAnimationRepeat(p0: Animator?) {
                //
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}