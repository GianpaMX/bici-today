package io.github.gianpamx.bicitoday.recording.di;

import dagger.Module;
import dagger.Provides;
import io.github.gianpamx.bicitoday.recording.RecordingActivity;
import io.github.gianpamx.bicitoday.recording.RecordingPresenter;
import io.github.gianpamx.bicitoday.recording.RecordingUseCase;

@Module
public class RecordingModule {
    private RecordingActivity recordingActivity;

    public RecordingModule(RecordingActivity recordingActivity) {
        this.recordingActivity = recordingActivity;
    }

    @Provides
    public RecordingUseCase provideRecordingUseCase() {
        return new RecordingUseCase();
    }

    @Provides
    public RecordingPresenter provideRecordingPresenter(RecordingUseCase recordingUseCase) {
        return new RecordingPresenter(recordingUseCase);
    }
}
