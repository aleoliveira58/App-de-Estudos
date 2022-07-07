package com.example.meuapp.ExercicioWhatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterChats
import com.example.meuapp.ExercicioWhatsapp.Adapter.AdapterStatus
import com.example.meuapp.ExercicioWhatsapp.Model.StatusModel
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    private var binding: FragmentStatusBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listaStatus = mutableListOf(
            StatusModel(R.drawable.android_status,"Carlos","16:03"),
            StatusModel(R.drawable.android_status,"Maria","10:00"),
            StatusModel(R.drawable.android_status,"Miguel","8:30"),
            StatusModel(R.drawable.android_status,"Fernando","Ontem"),
            StatusModel(R.drawable.android_status,"Raissa","Ontem"),
            StatusModel(R.drawable.android_status,"Fagner","Ontem"),
            StatusModel(R.drawable.android_status,"Mauricio","31/07/2022"),
            StatusModel(R.drawable.android_status,"João","30/07/2022"),
            StatusModel(R.drawable.android_status,"Igor","30/07/2022"),
            StatusModel(R.drawable.android_status,"Julia","30/07/2022"),
            StatusModel(R.drawable.android_status,"Maycon","29/07/2022"),
            StatusModel(R.drawable.android_status,"Romeu","28/07/2022"),
            StatusModel(R.drawable.android_status,"Leticia","28/07/2022"),
            StatusModel(R.drawable.android_status,"Heloisa","27/07/2022"),
            StatusModel(R.drawable.android_status,"Mario","27/07/2022"),
            StatusModel(R.drawable.android_status,"Marcos","26/07/2022"),
            StatusModel(R.drawable.android_status,"Sergio","26/07/2022"),
        )


        val statusAdapter = AdapterStatus(
            statusList = listaStatus
        )

        binding?.let{
            with(it){
                vgStatusWhatsApp.layoutManager = LinearLayoutManager(context)
                vgStatusWhatsApp.adapter = statusAdapter
            }

        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}