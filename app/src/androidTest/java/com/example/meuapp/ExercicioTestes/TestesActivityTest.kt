package com.example.meuapp.ExercicioTestes

import android.support.test.rule.ActivityTestRule
import com.example.meuapp.robot.TestesRobot
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TestesActivityTest{
    private lateinit var robot : TestesRobot


    @get:Rule
    var activityRule = ActivityTestRule(TestesActivity::class.java , false, false )
    
    @Before
    fun setup (){
        robot = TestesRobot(activityRule)
    }

    @Test
    fun testInputType(){
        robot
            .startActivity()
            .inputType()
    }

    @Test
    fun testClickButton(){
        robot
            .startActivity()
            .clickButton()
    }

    @Test
    fun testClickButtonAndInputType(){
        robot
            .startActivity()
            .inputType()
            .clickButton()
    }

    @After
    fun tearDown(){
        robot.finishActivity()
    }
}