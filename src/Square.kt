class Square(points: MutableList<Point>): Rectangle(points) {

    private fun checkWidthHeightEquality(): Boolean {
        if (width != height){
            return false
        }
        return true
    }

}