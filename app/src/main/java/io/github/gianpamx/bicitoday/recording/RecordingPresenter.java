package io.github.gianpamx.bicitoday.recording;

public class RecordingPresenter {
    private View view;

    public RecordingPresenter() {
    }

    public void pause() {
        if (view != null) view.showResumeButton();
    }

    public void setView(View view) {
        this.view = view;
    }

    public interface View {
        void showResumeButton();
    }
}
