package com.example.meuapp.robot

import android.content.Intent
import android.support.test.rule.ActivityTestRule
import com.example.meuapp.ExercicioTestes.TestesActivity
import com.example.meuapp.utils.TestesUtils
import com.example.meuapp.R

class TestesRobot(
    private val activityTestRule: ActivityTestRule<TestesActivity>
){

    fun startActivity(): TestesRobot {
        activityTestRule.launchActivity(Intent(Intent.ACTION_MAIN))
        return this
    }


    fun finishActivity() {
        activityTestRule.finishActivity()
    }

    
    fun inputType(): TestesRobot{
        TestesUtils.inputType(R.id.etNameTeste , "Alessandro")
        TestesUtils.hideKeyboard()
        TestesUtils.inputType(R.id.etProffisao , "Android Developer")
        TestesUtils.hideKeyboard()
        return  this
    }

    fun  clickButton(): TestesRobot{
            TestesUtils.clickButton(R.id.btSaveTestes)
        return  this
    }


}
