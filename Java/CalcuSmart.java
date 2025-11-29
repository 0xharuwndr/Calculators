import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("\nChoose an option:");
            System.out.println("[1]Basic Arithmetic Operations");
            System.out.println("[2]Calculate Area of a Circle");
            System.out.println("[3]Calculate Area of a Rectangle");
            System.out.println("[4]Calculate Area of a Triangle");
            System.out.println("[5]Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performBasicArithmetic(scanner);
                    break;
                case 2:
                    calculateCircleArea(scanner);
                    break;
                case 3:
                    calculateRectangleArea(scanner);
                    break;
                case 4:
                    calculateTriangleArea(scanner);
                    break;
                case 5:
                    continueCalculating = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private static void performBasicArithmetic(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("[1]Addition");
        System.out.println("[2]Subtraction");
        System.out.println("[3]Multiplication");
        System.out.println("[4]Division");
        System.out.println("[5]Exponentiation");
        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}