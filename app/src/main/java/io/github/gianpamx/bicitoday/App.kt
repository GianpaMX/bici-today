package io.github.gianpamx.bicitoday

import android.app.Application
import io.github.gianpamx.bicitoday.di.AppComponent
import io.github.gianpamx.bicitoday.di.AppModule
import io.github.gianpamx.bicitoday.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}
