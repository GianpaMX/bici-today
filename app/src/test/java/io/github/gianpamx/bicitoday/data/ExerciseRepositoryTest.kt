package io.github.gianpamx.bicitoday.data

import org.junit.Before

class ExerciseRepositoryTest {
    lateinit var exerciseLocalStorage: ExerciseLocalStorage

    @Before
    fun setUp() {
        exerciseLocalStorage = ExerciseLocalStorage()
    }
}
