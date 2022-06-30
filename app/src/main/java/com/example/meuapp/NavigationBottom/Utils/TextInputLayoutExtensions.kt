package com.example.meuapp.NavigationBottom.Utils

import android.text.Editable
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout?.getText(): String {
    return this?.editText?.text.toString()
}

fun String.getEdittable(): Editable {
    return Editable.Factory().newEditable(this)
}