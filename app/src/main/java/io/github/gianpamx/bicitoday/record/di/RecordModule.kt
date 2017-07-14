package io.github.gianpamx.bicitoday.record.di

import dagger.Module
import dagger.Provides
import io.github.gianpamx.bicitoday.di.ActivityScope
import io.github.gianpamx.bicitoday.record.RecordActivity
import io.github.gianpamx.bicitoday.record.RecordFragment
import io.github.gianpamx.bicitoday.record.RecordPresenter
import io.github.gianpamx.bicitoday.usecase.GetExerciseUseCase

@Module
class RecordModule(private val recordActivity: RecordActivity) {
    @Provides
    @ActivityScope
    fun provideRecordPresenter(getExerciseUseCase: GetExerciseUseCase, view: RecordPresenter.View): RecordPresenter {
        return RecordPresenter(getExerciseUseCase, view)
    }

    @Provides
    @ActivityScope
    fun provideRecordPResenterView(recordFragment: RecordFragment): RecordPresenter.View {
        return recordFragment
    }

    @Provides
    @ActivityScope
    fun provideRecordFragment(): RecordFragment {
        var recordFragment: RecordFragment? = recordActivity.supportFragmentManager.findFragmentById(android.R.id.content) as? RecordFragment

        if (recordFragment == null) {
            recordFragment = RecordFragment()
            recordActivity.supportFragmentManager.beginTransaction().add(android.R.id.content, recordFragment).commit()
        }

        return recordFragment
    }
}
