import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        double area = 0;
        boolean hasRadius = false;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Start");
            System.out.println("2. Input radius");
            System.out.println("3. Set area = 3.14 * (radius * radius)");
            System.out.println("4. Display area");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting the Circle Area Calculator...");
                    break;

                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    radius = scanner.nextDouble();
                    hasRadius = true;
                    System.out.println("Radius set to: " + radius);
                    break;

                case 3:
                    if (hasRadius) {
                        area = 3.14 * (radius * radius);
                        System.out.println("Area calculated.");
                    } else {
                        System.out.println("Please input the radius first (Option 2).");
                    }
                    break;

                case 4:
                    if (area > 0) {
                        System.out.println("The area of the circle is: " + area);
                    } else {
                        System.out.println("Please calculate the area first (Option 3).");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
