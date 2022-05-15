import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(points: MutableList<Point>): Shape(points) {
    var area: Double = calculateArea()

    init {
        if (!checkArea()) {
            throw Exception(message = "Error: Area must be non-zero.")
        }
    }

    private fun checkArea(): Boolean {
        if (area == 0.toDouble()) {
            return false
        }
        return true
    }

    private fun calculateArea(): Double {
        val side1 = sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
        val side2 = sqrt((points[2].x - points[1].x).pow(2) + (points[2].y - points[1].y).pow(2))
        val side3 = sqrt((points[0].x - points[2].x).pow(2) + (points[0].y - points[2].y).pow(2))

        val s = (side1+side2+side3)/2

        return sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }

}