package com.example.meuapp.ExercicioFamilia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuapp.R
import com.example.meuapp.databinding.ActivityListaAlunosBinding

class ListaAlunosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaAlunosBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaAlunosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val aluno1 = AlunosModel(
            foto = (R.drawable.ale),
            aluno = "Alessandro Machado",
            ra = "Me"
        )
        val aluno2 = AlunosModel(
            foto = (R.drawable.raissa),
            aluno = "Raissa Maria",
            ra = "Girlfriend"
        )
        val aluno3 = AlunosModel(
            foto = (R.drawable.miriam),
            aluno = "Miriam Cristina",
            ra = "Mother"
        )
        val aluno4 = AlunosModel(
            foto = (R.drawable.marcos),
            aluno = "Marcos Guerrero",
            ra = "Father"
        )
        val aluno5 = AlunosModel(
            foto = (R.drawable.julia),
            aluno = "Julia Gabriela",
            ra = "Sister"
        )
        val aluno6 = AlunosModel(
            foto = (R.drawable.gabriel),
            aluno = "Gabriel Vinicius",
            ra = "Brother"
        )
        val aluno7 = AlunosModel(
            foto = (R.drawable.zita),
            aluno = "Maria José",
            ra = "Grandmother"
        )
        val aluno8 = AlunosModel(
            foto = (R.drawable.arival),
            aluno = "Arival Machado",
            ra = "Grandfather"
        )
        val aluno9 = AlunosModel(
            foto = (R.drawable.angela),
            aluno = "Angela Maria",
            ra = "Grandmother"
        )
        val aluno10 = AlunosModel(
            foto = (R.drawable.nelson),
            aluno = "Nelson Oliveira",
            ra = "Grandfather"
        )

        val aluno11 = AlunosModel(
            foto = (R.drawable.leonor),
            aluno = "Leonor Guerreiro",
            ra = "Grandmother"
        )
        val aluno12 = AlunosModel(
            foto = (R.drawable.ramiro),
            aluno = "Ramiro Silva",
            ra = "Grandfather"
        )
        val aluno13 = AlunosModel(
            foto = (R.drawable.bebe),
            aluno = "Deivison Machado",
            ra = "Cousin"
        )
        val aluno14 = AlunosModel(
            foto = (R.drawable.joao),
            aluno = "Joao Vinicius",
            ra = "Friends"
        )
        val aluno15 = AlunosModel(
            foto = (R.drawable.boca),
            aluno = "Igor Vinicius",
            ra = "Friends"
        )
        val aluno16 = AlunosModel(
            foto = (R.drawable.rodrigo),
            aluno = "Rodrigo Ricardo",
            ra = "Friends"
        )
        val aluno17 = AlunosModel(
            foto = (R.drawable.victor),
            aluno = "Victor Luis",
            ra = "Friends"
        )
        val aluno18 = AlunosModel(
            foto = (R.drawable.caju),
            aluno = "Cassio Henrique",
            ra = "Friends"
        )

        val listaDeAlunos = listOf(aluno1,aluno2,aluno3,aluno4,aluno5,
        aluno6,aluno7,aluno8,aluno9,aluno10,aluno11,aluno12,aluno13,aluno14
            ,aluno15,aluno16,aluno17,aluno18)


        val alunosAdapter = AlunosAdapter(
            alunosList = listaDeAlunos
        )

        binding.let {
            with(it){

                rvAlunosRecyclerView.layoutManager = LinearLayoutManager(this@ListaAlunosActivity)
                rvAlunosRecyclerView.adapter = alunosAdapter
            }
        }



    }


}