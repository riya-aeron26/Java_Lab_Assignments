// Cylinder class
class Cylinder extends shape implements Volume {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateShape() {
        double area = 2 * Math.PI * radius * (radius + height);
        return area;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of Cylinder is not applicable.");
        return 0;
    }

    @Override
    public double calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
}