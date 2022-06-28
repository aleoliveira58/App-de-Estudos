package com.example.meuapp.ExercicioFamilia

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuapp.databinding.AlunosItemBinding

class AlunosAdapter(
    private val alunosList: List<AlunosModel>,
) : RecyclerView.Adapter<AlunosAdapter.AlunosViewHolder>() {

    class AlunosViewHolder(
        val binding: AlunosItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            alunos: AlunosModel,
        ) {
            binding.ivFotoAluno.setImageResource(alunos.foto)
            binding.txNomeAluno.text = alunos.aluno
            binding.tvRaAluno.text = alunos.ra
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): AlunosAdapter.AlunosViewHolder {
        val binding = AlunosItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return AlunosAdapter.AlunosViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlunosAdapter.AlunosViewHolder, position: Int) {
        holder.bind(alunosList[position])
    }

    override fun getItemCount() = alunosList.size


}
