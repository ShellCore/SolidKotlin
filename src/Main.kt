fun main() {
    val shapes: List<ShapeInterface> = listOf(
        Circle(2),
        Square(4),
        Cube(4)
    )

    val area = AreaCalculator(shapes)
    val volume : AreaCalculator = VolumeCalculator(shapes)

    val sumCalculatorOutputter = SumCalculatorOutputter(area)
    val sumCalculatorOutputter2 = SumCalculatorOutputter(volume)

    sumCalculatorOutputter.output()
    sumCalculatorOutputter2.output()
}