package io.github.gianpamx.bicitoday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class RecordingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recording_activity);

        Button pauseButton = (Button) findViewById(R.id.pause_recording_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(R.id.pause_resume_view_switcher);
                viewSwitcher.showNext();
            }
        });
    }
}
