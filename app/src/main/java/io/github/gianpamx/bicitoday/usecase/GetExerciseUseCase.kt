package io.github.gianpamx.bicitoday.usecase

import io.github.gianpamx.bicitoday.data.ExerciseRepository
import io.github.gianpamx.bicitoday.entity.Exercise

class GetExerciseUseCase(private val exerciseRepository: ExerciseRepository) {
    var callback: Callback<Exercise>? = null

    fun execute() {
    }
}
