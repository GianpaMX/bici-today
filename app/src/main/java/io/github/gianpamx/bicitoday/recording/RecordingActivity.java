package io.github.gianpamx.bicitoday.recording;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import io.github.gianpamx.bicitoday.App;
import io.github.gianpamx.bicitoday.recording.di.RecordingComponent;
import io.github.gianpamx.bicitoday.recording.di.RecordingModule;

public class RecordingActivity extends AppCompatActivity {

    @Inject
    public RecordingPresenter recordingPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, RecordingFragment.newInstance())
                    .commit();
        }
    }

    private void inject(RecordingActivity recordingActivity) {
        getRecordingComponent(recordingActivity).inject(recordingActivity);
    }

    private RecordingComponent getRecordingComponent(RecordingActivity recordingActivity) {
        return getAndroidApp().getAppComponent().recordingComponent(new RecordingModule(recordingActivity));
    }

    protected App getAndroidApp() {
        return (App) getApplication();
    }
}
