class Square(_points: MutableList<Point>): Rectangle(_points) {

    private fun checkWidthHeightEquality(): Boolean {
        if (width != height){
            return false
        }
        return true
    }

}