package com.example.meuapp.NavigationBottom.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.databinding.FragmentSharedNativoBinding


class SharedNativoFragment : Fragment() {

    private var binding: FragmentSharedNativoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSharedNativoBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val intent = Intent()
        val shared = intent.action
        if (shared == Intent.ACTION_SEND) {

        }

        binding?.btShare?.setOnClickListener {
            val intents = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_EMAIL, "Olá, estou com um problema e gostaria de uma solução")
                putExtra(Intent.EXTRA_SUBJECT, "Suporte ao usuário")
                putExtra(Intent.EXTRA_CC, "cnascimento@digitalhouse.com")
                putExtra(Intent.EXTRA_BCC, "lucas@digitalhouse.com")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(intents, "Compartilhe nosso app")
            startActivity(shareIntent)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}