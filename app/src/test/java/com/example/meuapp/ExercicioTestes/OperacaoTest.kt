package com.example.meuapp.ExercicioTestes

import com.example.meuapp.ExercicioTestes.Operacao.Companion.divide
import org.junit.*
import org.junit.Assert.*

class OperacaoTest {

    // Inicia antes das classes
    companion object {
        @BeforeClass
        @JvmStatic
        fun beforeClass(){

        }

    }


    // Before inicia antes de cada  @Test
    // Inicialização das classes a serem testadas ou reiniciar os valores padrôes das classes
    @Before
    fun setup(){
        val i = 1
    }

    // Inicia depois de cada @Test
    @After
    fun clear(){
        val a = 2
    }


    //Vai dar erro pq colocamos to.Double na função Operacação
    // @ignore e para ignorar o run desse test expecífico
    @Test
    @Ignore
    fun deveDarErroAoDividirPorZero() {
        try {
            Operacao.divide(4 ,0)
            fail()
        } catch (e: Exception){
            assertTrue(e is ArithmeticException)
        }
    }

    // Assim da certo
    @Test
    fun deveDarErroAoDividirPorZeroComToDouble(){
        val resultado = Operacao.divide(4 ,0)
        assertFalse(resultado.isFinite())
    }

    @Test
    fun deveDividirCorretamente() {
       assertEquals(2,Operacao.divide(4,2).toInt())
    }

    @Test
    fun deveDividirDoisNumerosNegativos(){
        assertEquals(2,Operacao.divide(-4,-2).toInt())
    }

    @Test
    fun deveDividirUmNumerosNegativos(){
        assertEquals(-2,Operacao.divide(-4,2).toInt())
    }

    @Test
    fun deveDividirComNumeradorZero(){
        assertEquals(0,Operacao.divide(0,-2).toInt())
    }

    @Test
    fun deveDividirNumeroImaparComNumeroPar(){
        assertEquals(1.5,Operacao.divide(3,2) , 0.0)
    }
}