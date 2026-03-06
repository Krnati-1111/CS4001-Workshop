public class MathOperations
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Unary Operators
        int x = 5;
        System.out.println("\nUnary Operators");
        System.out.println("Original value: " + x);
        System.out.println("Post Increment: " + x++);
        System.out.println("After Post Increment: " + x);
        System.out.println("Pre Increment: " + ++x);

        // Assignment Operator
        int c = 10;
        c += 5;
        System.out.println("\nAssignment Operator");
        System.out.println("Value after +=5 : " + c);

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));

        // Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("\nLogical Operators");
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));

        // Ternary Operator
        int result = (a > b) ? a : b;

        System.out.println("\nTernary Operator");
        System.out.println("Greater number is: " + result);
    }
}