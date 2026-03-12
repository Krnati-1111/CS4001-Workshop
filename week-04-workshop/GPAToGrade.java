import java.util.Scanner;

public class GPAToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA (0.0 to 4.0): ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: GPA must be between 0.0 and 4.0");
        } else {
            if (gpa >= 3.6) System.out.println("Grade: A");
            else if (gpa >= 3.2) System.out.println("Grade: B+");
            else if (gpa >= 2.8) System.out.println("Grade: B");
            else if (gpa >= 2.4) System.out.println("Grade: C+");
            else System.out.println("Grade: C or below");
        }
    }
}