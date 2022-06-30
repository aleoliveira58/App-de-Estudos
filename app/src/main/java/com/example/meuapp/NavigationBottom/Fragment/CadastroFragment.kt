package com.example.meuapp.NavigationBottom.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.edit
import com.example.meuapp.NavigationBottom.Utils.getEdittable
import com.example.meuapp.NavigationBottom.Utils.getText
import com.example.meuapp.databinding.FragmentCadastroBinding


class CadastroFragment : Fragment() {

    private var binding: FragmentCadastroBinding? = null

    private val sharedPreferences = this.activity?.getSharedPreferences("personal_date" , Context.MODE_PRIVATE)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCadastroBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //Existem dois modos de ser feito (Antigo)
//        val editor = sharedPreferences?.edit()
//        editor?.putString("name" , "Alessando")
//        editor?.putBoolean("isSaved" , true)
//        editor?.apply()
//
//        //( Atual )
//        sharedPreferences?.edit {
//            putString("email" , "aleholiveira@yahoo.com.br")
//            putBoolean("xpto" , false)
//        }


        binding?.btSave?.setOnClickListener {
            with(binding){
                val nome = this?.etName?.getText()
                val email = this?.etEmail?.getText()
                val gender = this?.etGender.getText()
                val phone = this?.etPhone.getText()
                val day = this?.etDay.getText()
                val month = this?.etMonth.getText()
                val year = this?.etYear.getText()
                val date = "$day/$month/$year"

                sharedPreferences?.edit {
                    putString(KEY_SHARED_NAME , nome)
                    putString(KEY_SHARED_EMAIL , email)
                    putString(KEY_SHARED_GENDER , gender)
                    putString(KEY_SHARED_PHONE, phone)
                    putString(KEY_SHARED_DATE , date)
                }

                Toast.makeText(context, "Dados salvo com sucesso!!", Toast.LENGTH_SHORT).show()

            }
        }

    }

    override fun onResume() {
        super.onResume()
        getUserData()
    }

    private fun getUserData() {
        with(sharedPreferences) {
            val name = this?.getString(KEY_SHARED_NAME, "")
            val email = this?.getString(KEY_SHARED_EMAIL, "")
            val gender = this?.getString(KEY_SHARED_GENDER, "")
            val phone = this?.getString(KEY_SHARED_PHONE, "")
            val date = this?.getString(KEY_SHARED_DATE, "")



            with(binding) {
                this?.etName?.editText?.text = name?.getEdittable()
                this?.etEmail?.editText?.text = name?.getEdittable()
                this?.etGender?.editText?.text = name?.getEdittable()
                this?.etPhone?.editText?.text = name?.getEdittable()

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


    companion object {
        const val KEY_SHARED_NAME = "name"
        const val KEY_SHARED_EMAIL = "email"
        const val KEY_SHARED_GENDER = "gender"
        const val KEY_SHARED_PHONE = "phone"
        const val KEY_SHARED_DATE = "date"
    }
}