class Circle(_points: MutableList<Point>, _radii: MutableList<Double>): Ellipse(_points, _radii) {

    init {
        if (!checkRadiiEquality()) {
            throw Exception(message = "Error: Area must be non-zero, and radii must be equal.")
        }
    }

    fun checkRadiiEquality(): Boolean {
        if (area == 0.toDouble()){
            return false
        }
        if (radii[0] != radii[1]) {
            return false
        }

        return true
    }

}