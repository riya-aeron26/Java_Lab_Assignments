// Rectangle class
class Rectangle extends shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateShape() {
        double area = length * breadth;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
