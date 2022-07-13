package com.example.meuapp.ExercicioTestes

class Aluno(
    val id: Int,
    val nomes: String,
    val notas: Array<Double> = emptyArray<Double>()
){
    fun media(): Double {
        throw NotImplementedError()
    }
}
