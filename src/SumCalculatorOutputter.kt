class SumCalculatorOutputter(private var areaCalculator: AreaCalculator) {

    fun output() = println("Sum of the areas of provided shapes: ${areaCalculator.sum()}")
}