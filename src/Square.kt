class Square(_points: MutableList<Point>): Rectangle(_points) {

    init {
        require(checkWidthHeightEquality(), {"Error: Width and height must be non-zero, and must be equal."})
    }

    private fun checkWidthHeightEquality(): Boolean {
        if (getWidth() == 0.toDouble() || getHeight() == 0.toDouble()){
            return false
        }
        if (getWidth() != getHeight()){
            return false
        }
        return true
    }

}