import kotlin.math.pow

class Circle(private var radius: Int) : ShapeInterface {

    override fun area(): Double {
        return Math.PI * radius.toDouble().pow(2.0)
    }
}