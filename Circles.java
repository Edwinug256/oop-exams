/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.circles;

/**
 *
 * @author CAROL
 */
import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double getArea() {
        return (22.0 / 7) * radius * radius;
    }

    // Method to calculate the circumference
    public double getCircumference() {
        return 2 * (22.0 / 7) * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        
        scanner.close();
    }
}
