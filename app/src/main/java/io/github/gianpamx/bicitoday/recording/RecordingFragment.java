package io.github.gianpamx.bicitoday.recording;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;

import io.github.gianpamx.bicitoday.R;

public class RecordingFragment extends Fragment implements RecordingPresenter.View {
    private View view;
    private RecordingContainer recordingContainer;

    public static RecordingFragment newInstance() {
        RecordingFragment fragment = new RecordingFragment();
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (!(context instanceof RecordingContainer)) {
            throw new RuntimeException("Acctivity should implement " + RecordingContainer.class.getSimpleName());
        }

        recordingContainer = (RecordingContainer) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.recording_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recordingContainer.onRecordingFragmentViewCreated(this);
    }

    @Override
    public void showResumeButton() {
        ViewSwitcher viewSwitcher = (ViewSwitcher) view.findViewById(R.id.pause_resume_view_switcher);
        viewSwitcher.showNext();
    }
}
