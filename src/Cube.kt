import kotlin.math.pow

class Cube(var length: Int) : SolidShapeInterface, ShapeInterface {

    override fun area() = (6 * (length * length)).toDouble()

    override fun volume() = length.toDouble().pow(3)
}