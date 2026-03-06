public class LiteralPractice
{
    public static void main(String[] args)
    {
        long bigNumber = 1234567890L;   // L for long literal
        float price = 12.5f;            // f for float literal
        char copyright = '\u00A9';      // Unicode for ©

        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + price);
        System.out.println("Unicode char: " + copyright);
    }
}