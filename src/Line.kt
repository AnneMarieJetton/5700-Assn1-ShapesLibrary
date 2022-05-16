import kotlin.math.pow
import kotlin.math.sqrt

class Line(_points: MutableList<Point>): Shape(_points) {

    init {
        require(checkLength(), {"Error: Length of the line cannot be zero."})
    }

    fun getSlope(): Double {
        return (points[1].y - points[0].y) / (points[1].x - points[0].x)
    }

    fun getLength(): Double {
        return sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
    }

    private fun checkLength(): Boolean {
        val length = getLength()
        if (length == 0.toDouble()) {
            return false
        }

        return true
    }

}