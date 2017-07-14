package io.github.gianpamx.bicitoday.record


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import io.github.gianpamx.bicitoday.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecordActivityTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(RecordActivity::class.java)

    @Test
    fun recordActivityTest() {
        onView(withId(R.id.recordFloatingActionButton)).perform(click())

        onView(withId(R.id.pauseFloatingActionButton)).check(matches(isDisplayed()))

        onView(withId(R.id.pauseFloatingActionButton)).perform(click())

        onView(withId(R.id.recordFloatingActionButton)).check(matches(isDisplayed()))
    }
}
