package com.example.todoperfect.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.todoperfect.AddActivity
import com.example.todoperfect.MainActivity
import com.example.todoperfect.R
import com.example.todoperfect.databinding.ActivityStartTaskBinding
import com.example.todoperfect.logic.model.Task
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import java.sql.Timestamp

@RunWith(AndroidJUnit4ClassRunner::class)
class EditTaskFragmentTest {
    @Test
    fun testFragmentNavigation() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.addBtn)).perform(click())
        onView(withId(R.id.titleLayout)).check(matches(isDisplayed()))
        onView(withId(R.id.cancelBtn)).perform(click())
        onView(withId(R.id.mainView)).check(matches(isDisplayed()))
    }
}