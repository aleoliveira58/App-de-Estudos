package com.example.meuapp.ExercicioAnimais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuapp.R
import com.example.meuapp.databinding.ActivityAnimaisBinding
import com.example.meuapp.databinding.ActivityMainBinding

class AnimaisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimaisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimaisBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var listAnimais = mutableListOf(
            ModelAnimais(R.drawable.akita, "Akita", "Tipos de cuidados: Alto" , "Característica: Leal, amigo e brincalhão"),
            ModelAnimais(R.drawable.basset_hound, "Basset hound", "Tipos de cuidados: Alto" , "Característica: Paciente, teimoso e charmoso"),
            ModelAnimais(R.drawable.beagle, "Beagle", "Tipos de cuidados: Médio" , "Característica: Alegre, companheiro e aventureiro"),
            ModelAnimais(R.drawable.bichonfrise, "Bichon Frisé", "Tipos de cuidados: Médio" , "Característica: Brincalhão, curioso e afetivo"),
            ModelAnimais(R.drawable.boiadeiro_australiano, "Boiadeiro Australiano", "Tipos de cuidados: Médio" , "Característica: Alerta, curioso e leal"),
            ModelAnimais(R.drawable.border_collie, "Border Collie", "Tipos de cuidados: Alto" , "Característica: Inteligente, leal e cheio de energia"),
            ModelAnimais(R.drawable.boston_terrier, "Boston Terrier", "Tipos de cuidados: Médio" , "Característica: Amigável, inteligente e vivaz"),
            ModelAnimais(R.drawable.boxer, "Boxer", "Tipos de cuidados: Alto" , "Característica: Leal, afetuoso e brincalhão"),
            ModelAnimais(R.drawable.buldogue_frances, "Buldogue Francês", "Tipos de cuidados: Alto" , "Característica: Carinhoso, leal e brincalhão"),
            ModelAnimais(R.drawable.buldogue_ingles, "Buldogue Inglês", "Tipos de cuidados: Alto" , "Característica: Calmo, divertido e dócil"),
            ModelAnimais(R.drawable.bull_terrier, "Bull Terrier", "Tipos de cuidados: Médio" , "Característica: Travesso, brincalhão e leal"),
            ModelAnimais(R.drawable.cane_corso, "Cane Corso", "Tipos de cuidados: Baixo" , "Característica: Protetor, leal e inteligente"),
            ModelAnimais(R.drawable.cavalier_king_charles_spaniel, "Cavalier King Charles Spaniel", "Tipos de cuidados: Alto" , "Característica: Companheiro, alegre e afetuoso"),
            ModelAnimais(R.drawable.chihuahua, "Chihuahua", "Tipos de cuidados: Médio" , "Característica: Charmoso, animado e atrevido"),
            ModelAnimais(R.drawable.chow_chow, "Chow Chow", "Tipos de cuidados: Alto" , "Característica: Calmo, leal e orgulhoso"),
            ModelAnimais(R.drawable.cocker_ingles, "Cocker Spaniel", "Tipos de cuidados: Alto" , "Característica: Alegre, carinhoso e cheio de vida"),
            ModelAnimais(R.drawable.dachshund, "Dachshund", "Tipos de cuidados: Médio" , "Característica: Corajoso, animado e inteligente"),
            ModelAnimais(R.drawable.dalmata, "Dálmata", "Tipos de cuidados: Médio" , "Característica: Atlético, protetor e amável"),
            ModelAnimais(R.drawable.doberman, "Doberman", "Tipos de cuidados: Médio" , "Característica: Inteligente, leal e protetor"),
            ModelAnimais(R.drawable.dogo_argentino, "Dogo argentino", "Tipos de cuidados: Médio" , "Característica: Leal, confiável e corajoso"),
            ModelAnimais(R.drawable.dogue_alemao, "Dogue alemão", "Tipos de cuidados: Alto" , "Característica: Amigável, paciente e dócil"),
            ModelAnimais(R.drawable.fila_brasileiro, "Fila brasileiro", "Tipos de cuidados: Baixo" , "Característica: Companheiro, corajoso e amoroso"),
            ModelAnimais(R.drawable.golden_retriever, "Golden retriever", "Tipos de cuidados: Alto" , "Característica: Inteligente, brincalhão e leal"),
            ModelAnimais(R.drawable.husky_siberiano, "Husky siberiano", "Tipos de cuidados: Médio" , "Característica: Amigável, trabalhador e extrovertido"),
            ModelAnimais(R.drawable.jack_russell_terrier, "Jack russell terrier", "Tipos de cuidados: Médio" , "Característica: Amigável, atlético e alerta"),
            ModelAnimais(R.drawable.labrador_retriever, "Labrador retriever", "Tipos de cuidados: Médio" , "Característica: Inteligente, carinhoso e brincalhão"),
            ModelAnimais(R.drawable.lhasa_apso, "Lhasa apso", "Tipos de cuidados: Médio" , "Característica: Esperto, confiante e independente"),
            ModelAnimais(R.drawable.lulu_da_pomerania, "Lulu da pomerânia", "Tipos de cuidados: Médio" , "Característica: Animado, inteligente e cheio de personalidade"),
            ModelAnimais(R.drawable.maltes, "Maltês", "Tipos de cuidados: Médio" , "Característica: Gentil, brincalhão e afetuoso"),
            ModelAnimais(R.drawable.mastiff_ingles, "Mastiff inglês", "Tipos de cuidados: Médio" , "Característica: Calmo, amável e leal"),
            ModelAnimais(R.drawable.mastim_tibetano, "Mastim tibetano", "Tipos de cuidados: Alto" , "Característica: Independente, reservado e inteligente"),
            ModelAnimais(R.drawable.pastor_alemao, "Pastor alemão", "Tipos de cuidados: Alto" , "Característica: Confiante, corajoso e inteligente"),
            ModelAnimais(R.drawable.pastor_australiano, "Pastor australiano", "Tipos de cuidados: Alto" , "Característica: Esperto, trabalhador e exuberante"),
            ModelAnimais(R.drawable.pastor_de_shetland, "Pastor de Shetland", "Tipos de cuidados: Alto" , "Característica: Brincalhão, energético e esperto"),
            ModelAnimais(R.drawable.pequines, "Pequinês", "Tipos de cuidados: Médio" , "Característica: Afetuoso, leal e elegante"),
            ModelAnimais(R.drawable.pinscher, "Pinscher", "Tipos de cuidados: Médio" , "Característica: Brincalhão, carinhoso e protetor"),
            ModelAnimais(R.drawable.pit_bull, "Pit bull", "Tipos de cuidados: Médio" , "Característica: Inteligente, forte e leal"),
            ModelAnimais(R.drawable.poodle, "Poodle", "Tipos de cuidados: Médio" , "Característica: Inteligente, forte e leal"),
            ModelAnimais(R.drawable.pug, "Pug", "Tipos de cuidados: Médio" , "Característica: Amoroso, temperamental e companheiro"),
            ModelAnimais(R.drawable.rottweiler, "Rottweiler", "Tipos de cuidados: Alto" , "Característica: Protetor, leal e inteligente"),
            ModelAnimais(R.drawable.schnauzer, "Schnauzer", "Tipos de cuidados: Alto" , "Característica: Dócil, leal e companheiro"),
            ModelAnimais(R.drawable.shar_pei, "Shar-peir", "Tipos de cuidados: Médio" , "Característica: Amoroso, companheiro e brincalhão"),
            ModelAnimais(R.drawable.shiba, "Shiba", "Tipos de cuidados: Baixo" , "Característica: Independente, leal e alerta"),
            ModelAnimais(R.drawable.shih_tzu, "Shih tzu", "Tipos de cuidados: Médio" , "Característica: Carinhoso, brincalhão e encantador"),
            ModelAnimais(R.drawable.staffordshire_bull_terrier, "Raça: Staffordshire Bull Terrier", "Tipos de cuidados: Médio" , "Característica: Inteligente, corajoso e determinado"),
            ModelAnimais(R.drawable.weimaraner, "Weimaraner", "Tipos de cuidados: Baixo" , "Característica: Amigável, corajoso e independente"),
            ModelAnimais(R.drawable.yorkshire, "Yorkshire", "Tipos de cuidados: Médio" , "Característica: Destemido, carinhoso e cheio de energia")

        )

        val animaisAdapter = AnimaisAdapter(
            animaisList = listAnimais
        )

        binding.let{
            with(it){
                rvAnimaisRecyclerView.layoutManager = LinearLayoutManager(this@AnimaisActivity)
                rvAnimaisRecyclerView.adapter = animaisAdapter
            }

        }

    }
}