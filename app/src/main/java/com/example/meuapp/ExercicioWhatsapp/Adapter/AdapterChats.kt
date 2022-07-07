package com.example.meuapp.ExercicioWhatsapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuapp.ExercicioAnimais.AnimaisAdapter
import com.example.meuapp.ExercicioAnimais.ModelAnimais
import com.example.meuapp.ExercicioWhatsapp.Model.ChatsModel
import com.example.meuapp.ExercicioWhatsapp.Model.StatusModel
import com.example.meuapp.databinding.AnimaisItemBinding
import com.example.meuapp.databinding.ChatsItemBinding

class AdapterChats(
    private val chatList: List<ChatsModel>
) : RecyclerView.Adapter<AdapterChats.ChatsViewHolder>(){


    class ChatsViewHolder(
        val binding: ChatsItemBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind (
            chats : ChatsModel
        ){
            binding.ivFotoChatsWhatsApp.setImageResource(chats.foto)
            binding.txNameChatsWhatsApp.text = chats.name
            binding.txMenssagemChatsWhatsApp.text = chats.menssage
            binding.txDataChats.text = chats.date


        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        val binding = ChatsItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return AdapterChats.ChatsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {
        holder.bind(chatList[position])
    }

    override fun getItemCount()= chatList.size


}

