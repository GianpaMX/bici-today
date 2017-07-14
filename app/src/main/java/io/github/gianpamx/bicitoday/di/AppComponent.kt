package io.github.gianpamx.bicitoday.di

import dagger.Component
import io.github.gianpamx.bicitoday.record.di.RecordComponent
import io.github.gianpamx.bicitoday.record.di.RecordModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun recordComponent(recordModule: RecordModule) : RecordComponent
}
