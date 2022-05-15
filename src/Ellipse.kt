open class Ellipse(_points: MutableList<Point>, _radii: MutableList<Double>): Shape(_points) {
    var radii: MutableList<Double> = _radii
    var area = Math.PI * radii[0] * radii[1]

    private fun checkArea(): Boolean {
        if (area == 0.toDouble()){
            return false
        }
        return true
    }

}