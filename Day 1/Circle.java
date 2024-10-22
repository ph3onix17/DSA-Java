import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: "); // Prompting the user for input
        double radius = sc.nextDouble();
        
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area); // Displaying the area
        
        sc.close();
    }
}
