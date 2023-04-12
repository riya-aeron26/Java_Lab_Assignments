import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        double length;
        double breath;
        double height;
        double side;
        System.out.println("Select Your Shape: ");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Sphere");
        System.out.println("5.Cylinder");
        System.out.println("6.Pyramid");
        System.out.println("7.Exit");
        int c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your choice: ");
        c = in.nextInt();
        switch (c){
            case 1:
                System.out.println("Enter the radius :");
                radius = in.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Circle area: " + circle.calculateShape());
                System.out.println("Circle perimeter: " + circle.calculatePerimeter());
                break;
            case 2:
                System.out.println("Enter length and breath :");
                length = in.nextDouble();
                breath = in.nextDouble();
                Rectangle rectangle = new Rectangle(length,breath);
                System.out.println("Rectangle area: " + rectangle.calculateShape());
                System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter side :");
                side = in.nextDouble();
                Square square = new Square(side);
                System.out.println("Square area: " + square.calculateShape());
                System.out.println("Square perimeter: " + square.calculatePerimeter());
                break;
            case 4:
                System.out.println("Enter the radius :");
                radius = in.nextDouble();
                Sphere sphere = new Sphere(radius);
                System.out.println("Sphere area: " + sphere.calculateShape());
                System.out.println("Sphere perimeter: " + sphere.calculatePerimeter());
                System.out.println("Sphere Volume: " + sphere.calculateVolume());
                break;
            case 5:
                System.out.println("Enter the radius , height :");
                radius = in.nextDouble();
                height = in.nextDouble();
                Cylinder cylinder = new Cylinder(radius,height);
                System.out.println("Cylinder area: " + cylinder.calculateShape());
                System.out.println("Cylinder perimeter: " + cylinder.calculatePerimeter());
                System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
                break;
            case 6:
                System.out.println("Enter the length , breath , height :");
                length = in.nextDouble();
                breath = in.nextDouble();
                height = in.nextDouble();
                Pyramid pyramid = new Pyramid(length,breath,height);
                System.out.println("Pyramid area: " + pyramid.calculateShape());
                System.out.println("Pyramid perimeter: " + pyramid.calculatePerimeter());
                System.out.println("Pyramid Volume: " + pyramid.calculateVolume());
                break;
            case 7:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Choice");
                break;

        }
    }
}