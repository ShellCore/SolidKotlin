class VolumeCalculator(shapes: List<ShapeInterface>) : AreaCalculator(shapes) {

    override fun sum(): List<Double> {
        val volumes = ArrayList<Double>()
        shapes.forEach { shape ->
            if (shape is SolidShapeInterface) {
                volumes.add(shape.volume())
            }
        }
        return volumes
    }
}