package com.example.meuapp.ExercicioWhatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterChats
import com.example.meuapp.ExercicioWhatsapp.Model.ChatsModel
import com.example.meuapp.ExercicioWhatsapp.Model.StatusModel
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    private var binding: FragmentChatBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var listaChats = mutableListOf(
            ChatsModel(R.drawable.android_chats,"Carlos","Boa tarde!!","16:03"),
            ChatsModel(R.drawable.android_chats,"Maria","Amanhã está maracdo","10:00"),
            ChatsModel(R.drawable.android_chats,"Miguel","Futebol top ontem, tmj!!","8:30"),
            ChatsModel(R.drawable.android_chats,"Fernando","Boa noite","Ontem"),
            ChatsModel(R.drawable.android_chats,"Raissa","Cinema bora??","Ontem"),
            ChatsModel(R.drawable.android_chats,"Fagner","Reunião remarcada","Ontem"),
            ChatsModel(R.drawable.android_chats,"Mauricio","Boa tarde!!","31/07/2022"),
            ChatsModel(R.drawable.android_chats,"João","Você assitiu o último ep?","30/07/2022"),
            ChatsModel(R.drawable.android_chats,"Igor","Show","30/07/2022"),
            ChatsModel(R.drawable.android_chats,"Julia","Manda um beijo pra ela","30/07/2022"),
            ChatsModel(R.drawable.android_chats,"Maycon","Você está com os uniformes ?","29/07/2022"),
            ChatsModel(R.drawable.android_chats,"Romeu","Futebol quinta as 21:00","28/07/2022"),
            ChatsModel(R.drawable.android_chats,"Leticia","Que role top!!","28/07/2022"),
            ChatsModel(R.drawable.android_chats,"Heloisa","Tabom, assim que eu souber te informo","27/07/2022"),
            ChatsModel(R.drawable.android_chats,"Mario","Legal!!","27/07/2022"),
            ChatsModel(R.drawable.android_chats,"Marcos","Blz, qualquer novidade te aviso","26/07/2022"),
            ChatsModel(R.drawable.android_chats,"Sergio","Bom dia","26/07/2022"),
        )

        val chatAdapter = AdapterChats(
            chatList = listaChats
        )

        binding?.let{
            with(it){
               vgChatsWhatsApp.layoutManager = LinearLayoutManager(context)
                vgChatsWhatsApp.adapter = chatAdapter
            }

        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}