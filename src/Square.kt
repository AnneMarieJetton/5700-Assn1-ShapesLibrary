class Square(_points: MutableList<Point>): Rectangle(_points) {

    init {
        if (!checkWidthHeightEquality()) {
            throw Exception(message = "Error: Width and height must be non-zero, and must be equal.")
        }
    }

    private fun checkWidthHeightEquality(): Boolean {
        if (width == 0.toDouble() || height == 0.toDouble()){
            return false
        }
        if (width != height){
            return false
        }
        return true
    }

}