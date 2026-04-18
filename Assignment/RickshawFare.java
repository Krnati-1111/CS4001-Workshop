import java.util.Scanner;

public class RickshawFare
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double baseFare = 100;
        double perKm = 40;
        double perMinute = 5;

        System.out.print("distance entered in km: ");
        double distance = input.nextDouble();

        System.out.print("time entered in minutes: ");
        int minutes = input.nextInt();

        System.out.print("you a local? (true/false): ");
        boolean local = input.nextBoolean();

        System.out.print("it is night time right? (true/false): ");
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