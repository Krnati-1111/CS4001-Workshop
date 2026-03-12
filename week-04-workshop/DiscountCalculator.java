import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Marked Price ");
        float mp = sc.nextFloat();
        System.out.print("Enter Catefory (A, B, C, or D: ");
        char cat = sc.next().toUpperCase().charAt(0);
        
        float discountPercent = 0;
        
        if (cat == 'A') {
            discountPercent = 60;
        } else if (cat == 'B') {
            discountPercent = 40;
        } else if (cat == 'C') {
            discountPercent = 20;
        } else if (cat == 'D') {
            discountPercent = 10;
        }
        float sp = mp - (mp * discountPercent / 100);
        System.out.println("Selling Price: " + sp);
        }
        }
        