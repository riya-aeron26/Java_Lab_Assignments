// Sphere class
class Sphere extends shape implements Volume {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateShape() {
        double area = 4 * Math.PI * radius * radius;
        return area;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of Sphere is not applicable.");
        return 0;
    }

    @Override
    public double calculateVolume() {
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}