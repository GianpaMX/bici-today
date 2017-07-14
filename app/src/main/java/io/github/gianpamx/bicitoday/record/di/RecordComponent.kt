package io.github.gianpamx.bicitoday.record.di

import dagger.Subcomponent
import io.github.gianpamx.bicitoday.di.ActivityScope
import io.github.gianpamx.bicitoday.record.RecordActivity

@ActivityScope
@Subcomponent(modules = arrayOf(RecordModule::class))
interface RecordComponent {
    fun inject(recordActivity: RecordActivity)
}
