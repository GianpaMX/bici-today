package io.github.gianpamx.bicitoday.di;

import javax.inject.Singleton;

import dagger.Component;
import io.github.gianpamx.bicitoday.recording.di.RecordingComponent;
import io.github.gianpamx.bicitoday.recording.di.RecordingModule;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    RecordingComponent recordingComponent(RecordingModule recordingModule);
}
