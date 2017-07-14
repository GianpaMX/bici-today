package io.github.gianpamx.bicitoday.entity

class Exercise {
    var id: String? = null
    var status: Status = Status.INACTIVE

    enum class Status {
        INACTIVE,
        ACTIVE,
        PAUSED
    }
}
