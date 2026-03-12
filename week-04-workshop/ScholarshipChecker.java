import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student GPA: ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA.");
        } else if (gpa >= 3.5) {
            System.out.println("Eligible for Full Scholarship!");
        } else if (gpa >= 3.0) {
            System.out.println("Eligible for Partial Scholarship.");
        } else {
            System.out.println("Not eligible for scholarship.");
        }
    }
}