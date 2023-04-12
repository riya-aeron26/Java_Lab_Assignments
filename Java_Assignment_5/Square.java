// Square class
class Square extends shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateShape() {
        double area = side * side;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}
