package io.github.gianpamx.bicitoday.di;

import dagger.Module;
import io.github.gianpamx.bicitoday.App;

@Module
public class AppModule {
    private final App app;

    public AppModule(App app) {
        this.app = app;
    }
}
