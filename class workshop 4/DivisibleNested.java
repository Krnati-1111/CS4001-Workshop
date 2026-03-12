import java.util.Scanner;

public class DivisibleNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("The number is divisble by both 3 and 5.");
            } else {
                System.out.println("The number is divisible by 3 but not by 5.");
            } 
        } else {
                System.out.println("The number is not divisible by both 3 and 5.");
            }
            sc.close();
            }
        }
    