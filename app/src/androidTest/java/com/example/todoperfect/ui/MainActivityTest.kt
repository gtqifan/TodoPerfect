package com.example.todoperfect.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.todoperfect.MainActivity
import com.example.todoperfect.R
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.mainView)).check(matches(isDisplayed()))
    }

    @Test
    fun testVisibility() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.addBtn)).check(matches(isDisplayed()))
        onView(withId(R.id.titleLayout)).check(matches(isDisplayed()))
        onView(withId(R.id.toolBarLayout)).check(matches(isDisplayed()))
        onView(withId(R.id.scrollView)).check(matches(isDisplayed()))
    }

    @Test
    fun isTimeDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.currentTime)).check(matches(isDisplayed()))
    }

}