import kotlin.math.pow
import kotlin.math.sqrt

class Line(points: MutableList<Point>): Shape(points) {

    fun getSlope(): Double {
        return (points[1].y - points[0].y) / (points[1].x - points[0].x)
    }

    fun getLength(): Double {
        return sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
    }

    private fun checkLength(): Boolean {
        val length = getLength()
        if (length.toInt() == 0) {
            return false
        }

        return true
    }

}