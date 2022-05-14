import kotlin.math.abs

open class Rectangle(points: MutableList<Point>): Shape(points) {
    val width = abs(points[1].x - points[0].x)
    val height = abs(points[1].y - points[0].y)

    fun getArea(): Double {
        return width * height
    }

    private fun checkWidthHeight(): Boolean {
        if (width.toInt() == 0 || height.toInt() == 0){
            return false
        }
        return true
    }

}