package io.github.gianpamx.bicitoday.di

import dagger.Module
import dagger.Provides
import io.github.gianpamx.bicitoday.App
import io.github.gianpamx.bicitoday.data.ExerciseLocalStorage
import io.github.gianpamx.bicitoday.data.ExerciseRepository
import io.github.gianpamx.bicitoday.usecase.GetExerciseUseCase
import javax.inject.Singleton

@Module
class AppModule(private val app: App) {
    @Provides
    @Singleton
    fun provideGetExerciseUseCase(exerciseRepository: ExerciseRepository): GetExerciseUseCase {
        return GetExerciseUseCase(exerciseRepository)
    }

    @Provides
    @Singleton
    fun provideExerciseRepository(exerciseLocalStorage: ExerciseLocalStorage): ExerciseRepository {
        return ExerciseRepository(exerciseLocalStorage)
    }

    @Provides
    @Singleton
    fun provideExerciseLocalStorage(): ExerciseLocalStorage {
        return ExerciseLocalStorage()
    }
}
