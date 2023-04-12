// Pyramid class
class Pyramid extends shape implements Volume {
    double length;
    double breadth;
    double height;

    Pyramid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateShape() {
        System.out.println(" Area of pyramid is not applicable");
        return 0;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of pyramid is not applicable.");
        return 0;
    }

    @Override
    public double calculateVolume() {
        double volume = (length * breadth * height) / 3;
        return volume;
    }
}

