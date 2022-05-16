open class Ellipse(_points: MutableList<Point>, _radii: MutableList<Double>): Shape(_points) {
    var radii: MutableList<Double> = _radii

    init {
        require(checkArea(), {"Error: Area must be non-zero."})
    }

    fun getArea(): Double {
        return Math.PI * radii[0] * radii[1]
    }

    private fun checkArea(): Boolean {
        if (getArea() == 0.toDouble()){
            return false
        }
        return true
    }

}