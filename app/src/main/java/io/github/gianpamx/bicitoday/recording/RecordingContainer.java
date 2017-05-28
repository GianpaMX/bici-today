package io.github.gianpamx.bicitoday.recording;

import android.view.View;

interface RecordingContainer {
    void onPauseClicked(View view);

    void onRecordingFragmentViewCreated(RecordingFragment fragment);
}
