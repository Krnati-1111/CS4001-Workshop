import java.util.Scanner;

public class DiscountSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Marked Price: ");
        float mp = sc.nextFloat();
        System.out.print("Enter Category (A, B, C, D): ");
        char cat = sc.next().toUpperCase().charAt(0);
        
        float discountPercent = 0;
        
        switch (cat) {
            case 'A': discountPercent = 60; break;
            case 'B': discountPercent = 40; break;
            case 'C': discountPercent = 20; break;
            case 'D': discountPercent = 10; break; 
            default: System.out.println("Invalid Category");
        }
        float sp = mp - (mp * discountPercent / 100);
        System.out.println("Selling Price: " + sp);
        }
    }
