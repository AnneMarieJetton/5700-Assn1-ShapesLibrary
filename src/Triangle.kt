import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(points: MutableList<Point>): Shape(points) {
    var base = 0.toDouble()
    var area = 0.toDouble()
    var height = findHeight()

    private fun checkArea(): Boolean {
        if (area == 0.toDouble()) {
            return false
        }
        return true
    }

    private fun findHeight(): Double {
        val side1 = sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
        val side2 = sqrt((points[2].x - points[1].x).pow(2) + (points[2].y - points[1].y).pow(2))
        val side3 = sqrt((points[0].x - points[2].x).pow(2) + (points[0].y - points[2].y).pow(2))

        base = max(max(side1, side2), side3)

        val s = (side1+side2+side3)/2

        area = sqrt(s*(s-side1)*(s-side2)*(s-side3))

        return (2*area)/base
    }

}