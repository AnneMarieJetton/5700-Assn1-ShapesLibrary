import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LineTest {

    @Test
    fun getSlope() {
        var points: MutableList<Point> = mutableListOf()
        points.add(Point(0.toDouble(), 0.toDouble()))
        points.add(Point(1.toDouble(), 0.toDouble()))

        var line = Line(points)

        assertEquals(0.toDouble(), line.getSlope())
    }

    @Test
    fun getLength() {
        var points: MutableList<Point> = mutableListOf()
        points.add(Point(0.toDouble(), 0.toDouble()))
        points.add(Point(1.toDouble(), 0.toDouble()))

        var line = Line(points)

        println(line.getLength())
        assertEquals(1.toDouble(), line.getLength())
    }
}