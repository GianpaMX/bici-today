package io.github.gianpamx.bicitoday.data

import io.github.gianpamx.bicitoday.entity.Exercise
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class ExerciseRepository(private val exerciseLocalStorage: ExerciseLocalStorage) {
    fun findActiveExercise(): Observable<Exercise> {
        return Observable.create<Exercise> { subscriber ->
            val activeExercise = exerciseLocalStorage.findActiveExercise()
            if (activeExercise != null) {
                subscriber.onNext(activeExercise)
            }
            subscriber.onComplete()
        }.subscribeOn(Schedulers.io())
    }
}
