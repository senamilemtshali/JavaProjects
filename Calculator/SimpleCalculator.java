import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

       
        System.out.println("\nChoose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0; 
        boolean validOperation = true; 

        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false; 
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                validOperation = false; 
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
