package io.github.gianpamx.bicitoday.recording;

public class RecordingUseCase {
    private Recorder recorder;

    public void record() {
        if(!recorder.isRecording()) {
            recorder.startRecording();
        }
    }
}
