import java.util.Scanner;

public class UseInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");  // It's good to prompt the user for input

        // Read an integer (age) from the user
        int age = sc.nextInt();

        // Print the entered age
        System.out.println("Age: " + age);
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
