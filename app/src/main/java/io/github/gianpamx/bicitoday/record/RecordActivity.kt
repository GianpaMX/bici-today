package io.github.gianpamx.bicitoday.record

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import io.github.gianpamx.bicitoday.App
import io.github.gianpamx.bicitoday.record.di.RecordComponent
import io.github.gianpamx.bicitoday.record.di.RecordModule
import javax.inject.Inject

class RecordActivity : LifecycleActivity(), RecordFragment.RecordFragmentContainer {
    @Inject
    lateinit var presenter: RecordPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inject(this)

        if (savedInstanceState == null) {
            presenter.requestExercise()
        }
    }

    private fun inject(recordActivity: RecordActivity) {
        recordComponent(recordActivity)?.inject(recordActivity)
    }

    private fun recordComponent(recordActivity: RecordActivity): RecordComponent? {
        return (application as? App)?.appComponent?.recordComponent(RecordModule(recordActivity))
    }

    override fun onRecordClick() {
        presenter.record()
    }

    override fun onPauseClick() {
    }
}
