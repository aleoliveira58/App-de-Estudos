package com.example.meuapp.ExercicioTestes

import org.junit.Assert.*
import org.junit.Ignore
import org.junit.Test

class TurmaTestUnit {


    @Test
    @Ignore
    fun turmaDeveInicializarVazia(){
        val turma = Turma("Peixe")
        assertTrue(turma.turmaVazia())
    }

    @Test
    fun deveInserirAlunoComSucesso() {
        val turma = Turma("Peixe")

        assertEquals(0, turma.quantidadeDeAlunos())
        turma.addAluno(Aluno(1, "Lucas"))
        assertEquals(1, turma.quantidadeDeAlunos())
    }


    @Test
    fun deveDarErroAoInserirAlunoDuplicado() {
        try {
            val turma = Turma("Peixe")
            turma.addAluno(Aluno(1, "Lucas"))
            turma.addAluno(Aluno(1, "Pedro"))
            fail()
        } catch (error: AlunosException) {
            assertEquals("Aluno duplicado", error.message)
        }

    }


    @Test
    fun deveDarSucessoAoInserirAlunoComNomeDuplicado() {
        val turma = Turma("Peixe")
        turma.addAluno(Aluno(1, "Lucas"))
        turma.addAluno(Aluno(2, "Lucas"))

    }


    @Test
    fun deveBuscarAlunoComSucesso() {
        val turma = Turma("Peixe")
        turma.addAluno(Aluno(1, "Lucas"))
        val alunoEncontrado = turma.buscar(1)

        assertNotNull(alunoEncontrado)

    }

    @Test
    fun deveBuscarAlunoPeloIdComSucesso() {
        val turma = Turma("Peixe")
        turma.addAluno(Aluno(1, "Lucas"))
        val alunoEncontrado = turma.buscar(1)

        assertNotNull(alunoEncontrado)
        assertEquals(1 , alunoEncontrado?.id)

    }
}