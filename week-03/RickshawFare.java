import java.util.Scanner;

public class RickshawFare
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double baseFare = 50;
        double perKm = 20;
        double perMinute = 2;

        System.out.print("Enter distance in km: ");
        double distance = input.nextDouble();

        System.out.print("Enter time in minutes: ");
        int minutes = input.nextInt();

        System.out.print("Are you a local? (true/false): ");
        boolean local = input.nextBoolean();

        System.out.print("Is it night time? (true/false): ");
        boolean night = input.nextBoolean();

        double fare = baseFare + (distance * perKm) + (minutes * perMinute);

        if(local && distance > 10)
        {
            fare = fare - 20; // local discount
        }

        if(night)
        {
            fare = fare + 30; // night surcharge
        }

        System.out.println("Total Fare: " + fare);
    }
}