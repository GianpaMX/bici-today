package io.github.gianpamx.bicitoday;

import android.app.Application;

import io.github.gianpamx.bicitoday.di.AppComponent;
import io.github.gianpamx.bicitoday.di.AppModule;
import io.github.gianpamx.bicitoday.di.DaggerAppComponent;

public class App extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }
}
