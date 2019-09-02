class Square(private var length: Int) : ShapeInterface {

    override fun area() = (length * length).toDouble()
}