package com.example.meuapp.ExercicioTestes

class Turma(val nome:String){
    private val alunos: MutableList<Aluno> = mutableListOf()

    fun addAluno(aluno:Aluno){
    val duplicated = alunos.any {it.id == aluno.id}

    if (duplicated) throw AlunosException("Aluno duplicado")

    alunos.add(aluno)
}

fun buscar (id: Int): Aluno? {
    val aluno = alunos.filter {id == id}
    return if (aluno.isNotEmpty()) aluno[0] else null
}

    fun turmaVazia() : Boolean = alunos.isNotEmpty()
    fun quantidadeDeAlunos() : Int = alunos.size
}
