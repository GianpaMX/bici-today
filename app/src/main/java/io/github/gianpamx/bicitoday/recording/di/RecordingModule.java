package io.github.gianpamx.bicitoday.recording.di;

import dagger.Module;
import dagger.Provides;
import io.github.gianpamx.bicitoday.recording.RecordingActivity;
import io.github.gianpamx.bicitoday.recording.RecordingPresenter;

@Module
public class RecordingModule {
    private RecordingActivity recordingActivity;

    public RecordingModule(RecordingActivity recordingActivity) {
        this.recordingActivity = recordingActivity;
    }

    @Provides
    public RecordingPresenter provideRecordingPresenter() {
        return new RecordingPresenter();
    }
}
