// Circle class
class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateShape() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}