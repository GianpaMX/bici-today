package io.github.gianpamx.bicitoday.record

import io.github.gianpamx.bicitoday.entity.Exercise
import io.github.gianpamx.bicitoday.usecase.Callback
import io.github.gianpamx.bicitoday.usecase.GetExerciseUseCase

class RecordPresenter(private val getExerciseUseCase: GetExerciseUseCase, val view: View?) : Callback<Exercise> {
    init {
        getExerciseUseCase.callback = this
    }

    fun record() {
        view?.showPauseButton()
    }

    fun requestExercise() {
        getExerciseUseCase.execute();
    }

    override fun onSucess(exercise: Exercise) {
        if (exercise.status == Exercise.Status.ACTIVE) {
            view?.showPauseButton()
        } else {
            view?.showRecordButton()
        }
    }

    interface View {
        fun showPauseButton()
        fun showRecordButton()
    }
}
