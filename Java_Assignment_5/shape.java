import java.util.Scanner;

// Abstract class Shape
abstract class shape {
    abstract double calculateShape();
    abstract double calculatePerimeter();
    void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }
}