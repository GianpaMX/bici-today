package io.github.gianpamx.bicitoday;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class RecordingFragment extends Fragment {
    private View view;

    public static RecordingFragment newInstance() {
        RecordingFragment fragment = new RecordingFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.recording_fragment, container, false);

        Button pauseButton = (Button) view.findViewById(R.id.pause_recording_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewSwitcher viewSwitcher = (ViewSwitcher) view.findViewById(R.id.pause_resume_view_switcher);
                viewSwitcher.showNext();
            }
        });

        return view;
    }
}
