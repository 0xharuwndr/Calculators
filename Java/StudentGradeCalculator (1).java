import java.util.Scanner;

public class GradeCalculator {

    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static String getEquivalent(double avg) {
        if (avg >= 97.50 && avg <= 100)
            return "1.00 (Excellent)";
        else if (avg >= 94.50)
            return "1.25 (Very Good)";
        else if (avg >= 91.50)
            return "1.50 (Very Good)";
        else if (avg >= 86.50)
            return "1.75 (Very Good)";
        else if (avg >= 81.50)
            return "2.00 (Satisfactory)";
        else if (avg >= 76.00)
            return "2.25 (Satisfactory)";
        else if (avg >= 70.50)
            return "2.50 (Satisfactory)";
        else if (avg >= 65.00)
            return "2.75 (Fair)";
        else if (avg >= 59.50)
            return "3.00 (Fair)";
        else
            return "5.00 (Failed)";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();

        double[] grades = new double[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        double average = calculateAverage(grades);

        String equivalent = getEquivalent(average);

        System.out.println("\n===== RESULT =====");
        System.out.println("Average Grade: " + average);
        System.out.println("Equivalent: " + equivalent);

        input.close();
    }
}
