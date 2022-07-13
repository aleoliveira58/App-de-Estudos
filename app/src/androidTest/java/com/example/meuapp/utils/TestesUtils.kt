package com.example.meuapp.utils


import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId


object TestesUtils {

    fun inputType(id: Int, text: String){
        onView(withId(id))
            .perform(typeText(text))
    }

    fun clickButton(id: Int){
        onView(withId(id))
            .perform(click())
    }


    fun hideKeyboard(){
        closeSoftKeyboard()
    }


}