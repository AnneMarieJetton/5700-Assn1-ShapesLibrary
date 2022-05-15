import kotlin.math.abs

open class Rectangle(_points: MutableList<Point>): Shape(_points) {
    val width = abs(points[1].x - points[0].x)
    val height = abs(points[1].y - points[0].y)

    fun getArea(): Double {
        return width * height
    }

    private fun checkWidthHeight(): Boolean {
        if (width == 0.toDouble() || height == 0.toDouble()){
            return false
        }
        return true
    }

}