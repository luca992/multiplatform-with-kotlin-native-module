package co.talkshop.domain



actual class Date {
    private val calendar: Long

    actual constructor() {
        calendar = 0
    }

    constructor(date: Long) {
        calendar = date
    }

    val date: Long get() = calendar

    actual fun getDate() = calendar.toInt()
    actual fun getMonth() = calendar.toInt()
    actual fun getFullYear() = calendar.toInt()
    actual fun getHours() = calendar.toInt()
    actual fun getMinutes() = calendar.toInt()
    actual fun getTime(): Number = calendar

    override fun equals(other: Any?): Boolean = other is Date && other.calendar.time == calendar.time
}

actual operator fun Date.compareTo(otherDate: Date): Int = date.compareTo(otherDate.date)


actual fun parseDate(dateString: String): Date = Date()

actual fun Date.toReadableDateString() = ""
actual fun Date.toReadableTimeString() = ""
