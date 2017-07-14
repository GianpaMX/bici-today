package io.github.gianpamx.bicitoday.usecase

interface Callback<T> {
    fun onSucess(response: T)
}
