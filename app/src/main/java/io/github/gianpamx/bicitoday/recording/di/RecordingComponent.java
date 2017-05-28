package io.github.gianpamx.bicitoday.recording.di;

import dagger.Subcomponent;
import io.github.gianpamx.bicitoday.di.ActivityScope;
import io.github.gianpamx.bicitoday.recording.RecordingActivity;

@ActivityScope
@Subcomponent(modules = {RecordingModule.class})
public interface RecordingComponent {
    void inject(RecordingActivity recordingActivity);
}
