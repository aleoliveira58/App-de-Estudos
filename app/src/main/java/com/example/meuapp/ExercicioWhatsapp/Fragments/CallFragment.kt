package com.example.meuapp.ExercicioWhatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterCall
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterChats
import com.example.meuapp.ExercicioWhatsapp.Model.CallModel
import com.example.meuapp.ExercicioWhatsapp.Model.ChatsModel
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listaCall = mutableListOf(
            CallModel(R.drawable.android_chats,"Carlos","16:03"),
            CallModel(R.drawable.android_chats,"Maria","10:00"),
            CallModel(R.drawable.android_chats,"Miguel","8:30"),
            CallModel(R.drawable.android_chats,"Fernando","Ontem"),
            CallModel(R.drawable.android_chats,"Raissa","Ontem"),
            CallModel(R.drawable.android_chats,"Fagner","Ontem"),
            CallModel(R.drawable.android_chats,"Mauricio","31/07/2022"),
            CallModel(R.drawable.android_chats,"João","30/07/2022"),
            CallModel(R.drawable.android_chats,"Igor","30/07/2022"),
            CallModel(R.drawable.android_chats,"Julia","30/07/2022"),
            CallModel(R.drawable.android_chats,"Maycon","29/07/2022"),
            CallModel(R.drawable.android_chats,"Romeu","28/07/2022"),
            CallModel(R.drawable.android_chats,"Leticia","28/07/2022"),
            CallModel(R.drawable.android_chats,"Heloisa","27/07/2022"),
            CallModel(R.drawable.android_chats,"Mario","27/07/2022"),
            CallModel(R.drawable.android_chats,"Marcos","26/07/2022"),
            CallModel(R.drawable.android_chats,"Sergio","26/07/2022")
        )

        val callAdapter = AdapterCall(
            callList = listaCall
        )

        binding?.let{
            with(it){
                vgCallWhatsApp.layoutManager = LinearLayoutManager(context)
                vgCallWhatsApp.adapter = callAdapter
            }

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}