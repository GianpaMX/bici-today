package io.github.gianpamx.bicitoday.recording;

public class RecordingPresenter {
    private View view;
    private RecordingUseCase recordingUseCase;

    public RecordingPresenter(RecordingUseCase recordingUseCase) {
        this.recordingUseCase = recordingUseCase;
    }

    public void pause() {
        if (view != null) view.showResumeButton();
    }

    public void setView(View view) {
        this.view = view;
    }

    public void record() {
        recordingUseCase.record();
    }

    public interface View {
        void showResumeButton();
    }
}
