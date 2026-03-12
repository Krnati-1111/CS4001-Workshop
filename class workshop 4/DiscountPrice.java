import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float mp, sp, discount = 0;
        char category;
        
        System.out.print("Enter Marked Price: ");
        mp = sc.nextFloat();
        
        System.out.print("Enter Category (A/B/C/D): ");
        category = sc.next().charAt(0);
        
        if (category == 'A') {
         discount = 60;
        }
        else if (category == 'B') {
            discount = 40;
        }
        else if (category == 'C') {
            discount = 20;
        }
        else {
            System.out.println("Invalid Category");
            return;
        }
        sp = mp - (mp * discount / 100);
        
        System.out.println("Selling Price = " + sp);
        
        sc.close();
        }
        }
        