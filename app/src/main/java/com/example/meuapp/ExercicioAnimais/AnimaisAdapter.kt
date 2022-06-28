package com.example.meuapp.ExercicioAnimais

import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuapp.ExercicioFamilia.AlunosAdapter
import com.example.meuapp.databinding.AlunosItemBinding
import com.example.meuapp.databinding.AnimaisItemBinding

class AnimaisAdapter(
    private val animaisList: List<ModelAnimais>
) : RecyclerView.Adapter<AnimaisAdapter.AnimaisViewHolder>(){


    class AnimaisViewHolder(
        val binding: AnimaisItemBinding
        ): RecyclerView.ViewHolder(binding.root){

            fun bind(
                animais : ModelAnimais
            ){
                binding.ivFotoAnimais.setImageResource(animais.foto)
                binding.txRacaAnimais.text = animais.raca
                binding.txTipoAnimais.text = animais.tipo
                binding.txCaracteristicaAnimais.text = animais.caracteristica
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimaisViewHolder {
        val binding = AnimaisItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return AnimaisAdapter.AnimaisViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimaisViewHolder, position: Int) {
        holder.bind(animaisList[position])
    }

    override fun getItemCount() = animaisList.size




}
