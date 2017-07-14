package io.github.gianpamx.bicitoday.record


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import io.github.gianpamx.EspressoTestsMatchers
import io.github.gianpamx.bicitoday.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecordActivityTest {

    @Rule
    var mActivityTestRule = ActivityTestRule(RecordActivity::class.java)

    var fab: ViewInteraction? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        fab = onView(withId(R.id.recordFloatingActionButton))
    }

    @Test
    fun recordActivityTest() {
        fab!!.perform(click())

        fab!!.check(matches(EspressoTestsMatchers.withDrawable(R.drawable.ic_pause_24dp)))
    }
}
