package io.github.gianpamx.bicitoday.recording;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class RecordingService extends Service {
    private RecordingServiceBinder binder = new RecordingServiceBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public class RecordingServiceBinder extends Binder {
        public RecordingService getService() {
            return RecordingService.this;
        }
    }
}
