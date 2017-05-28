package io.github.gianpamx.bicitoday.recording;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class RecordingPresenterTest {
    @Mock
    public RecordingPresenter.View view;

    private RecordingPresenter recordingPresenter;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        recordingPresenter = new RecordingPresenter();
        recordingPresenter.setView(view);
    }

    @Test
    public void pause() {
        recordingPresenter.pause();

        verify(view).showResumeButton();
    }
}
