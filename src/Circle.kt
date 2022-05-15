class Circle(_points: MutableList<Point>, _radii: MutableList<Double>): Ellipse(_points, _radii) {

    fun checkRadiiEquality(): Boolean {
        if (radii[0] != radii[1]) {
            return false
        }

        return true
    }

}