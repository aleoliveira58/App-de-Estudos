package com.example.meuapp.ExercicioPermissao

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.meuapp.R
import com.example.meuapp.databinding.FragmentPermissaoBinding
import com.google.android.material.snackbar.Snackbar


class PermissaoFragment : Fragment() {

    private var binding: FragmentPermissaoBinding? = null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentPermissaoBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Register the permissions callback, which handles the user's response to the
// system permissions dialog. Save the return value, an instance of
// ActivityResultLauncher. You can use either a val, as shown in this snippet,
// or a lateinit var in your onAttach() or onCreate() method.
        val requestPermissionLauncher =
            registerForActivityResult(ActivityResultContracts.RequestPermission()
            ) { isGranted: Boolean ->
                if (isGranted) {
                    Snackbar.make(
                        binding!!.ibCompartilhamento, "Permissão já concedida",
                        Snackbar.LENGTH_SHORT
                    ).show()
                } else {
                    Snackbar.make(
                        binding!!.ibCompartilhamento, "Permissão não concedida",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }

        binding?.ibCompartilhamento?.setOnClickListener {
            when (PackageManager.PERMISSION_GRANTED) {
                activity?.let { it1 ->
                    ContextCompat.checkSelfPermission(
                        it1,
                        Manifest.permission.MANAGE_EXTERNAL_STORAGE
                    )
                }
                -> {
                    // You can use the API that requires the permission.
                    Snackbar.make(
                        binding!!.ibCompartilhamento, "Permissão já concedida",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    // You can directly ask for the permission.
                    // The registered ActivityResultCallback gets the result of this request.
                    requestPermissionLauncher.launch(
                        Manifest.permission.MANAGE_EXTERNAL_STORAGE)
                }
            }


        }

        binding?.ibCamera?.setOnClickListener {
            when (PackageManager.PERMISSION_GRANTED) {
                activity?.let { it1 ->
                    ContextCompat.checkSelfPermission(
                        it1,
                        Manifest.permission.CAMERA
                    )
                }
                -> {
                    // You can use the API that requires the permission.
                    Snackbar.make(
                        binding!!.ibCompartilhamento, "Permissão já concedida",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    // You can directly ask for the permission.
                    // The registered ActivityResultCallback gets the result of this request.
                    requestPermissionLauncher.launch(
                        Manifest.permission.CAMERA)
                }
            }


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}