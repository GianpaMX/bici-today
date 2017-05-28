package io.github.gianpamx.bicitoday;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.schibsted.spain.barista.BaristaAssertions.assertDisplayed;
import static com.schibsted.spain.barista.BaristaClickActions.click;

@RunWith(AndroidJUnit4.class)
public class RecordingActivityTest {
    @Rule
    public ActivityTestRule<RecordingActivity> mActivityRule = new ActivityTestRule<>(RecordingActivity.class);

    @Test
    public void pauseRecording() {
        click(R.id.pause_recording_button);

        assertDisplayed(R.id.resume_recording_button);
    }
}