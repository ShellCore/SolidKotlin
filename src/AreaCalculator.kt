import java.lang.Exception

open class AreaCalculator(var shapes: List<ShapeInterface>) {

    open fun sum() : List<Double> {
        val areas = ArrayList<Double>()
        shapes.forEach {shape ->
            areas.add(shape.area())
        }
        return areas
    }
}