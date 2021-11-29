package com.example.todoperfect.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.todoperfect.AddActivity
import com.example.todoperfect.EditTaskFragment
import com.example.todoperfect.MainActivity
import com.example.todoperfect.R
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class AddActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(AddActivity::class.java)

    @Test
    fun testVisibility() {
        onView(withId(R.id.titleLayout)).check(matches(isDisplayed()))
        onView(withId(R.id.cancelBtn)).check(matches(isDisplayed()))
        onView(withId(R.id.titleText)).check(matches(isDisplayed()))
        onView(withId(R.id.completeBtn)).check(matches(isDisplayed()))
    }

    @Test
    fun testBtnPress() {
        onView(withId(R.id.trivialBtn)).perform(click())
        onView(withId(R.id.normalBtn)).perform(click())
        onView(withId(R.id.importantBtn)).perform(click())
        onView(withId(R.id.milestoneBtn)).perform(click())
        onView(withId(R.id.memorialBtn)).perform(click())
    }
}