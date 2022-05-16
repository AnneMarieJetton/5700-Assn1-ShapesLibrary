import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TriangleTest {

    @Test
    fun getArea() {
        var points: MutableList<Point> = mutableListOf()
        points.add(Point(0.toDouble(), 0.toDouble()))
        points.add(Point(1.toDouble(), 1.toDouble()))
        points.add(Point(0.toDouble(), 1.toDouble()))

        var triangle = Triangle(points)

        assertEquals(0.4999999999999998, triangle.getArea())

    }

}