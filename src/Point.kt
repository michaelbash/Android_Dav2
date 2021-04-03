fun main() {
    val coordinate = Point(1.0F, 2.0F)
    println(coordinate.toString())
    println(coordinate.x.equals(coordinate.y))

}

class Point {
    var x: Float = 0.0F
    var y: Float = 1.0F

    constructor(xcoordinate: Float, ycoordinate: Float) {
        x = xcoordinate
        y = ycoordinate

    }

    override fun toString(): String {
        return "$x , $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == y){
                return true
            }
        }
        return false
    }

}