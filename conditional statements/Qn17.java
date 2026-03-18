import java.util.*;
import java.util.Scanner;
public class Qn17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine();
        String loyaltyTier = sc.nextLine();
        double baseRate = 0;
        double seasonalMultiplier = 0;
        int extendedDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrades = "None";
        if(roomCategory.equalsIgnoreCase("Standard"))
            baseRate = 150;
        else if(roomCategory.equalsIgnoreCase("Deluxe"))
            baseRate = 300;
        else if(roomCategory.equalsIgnoreCase("Suite"))
            baseRate = 500;
        else if(roomCategory.equalsIgnoreCase("Presidential"))
            baseRate = 1000;
        if(season.equalsIgnoreCase("Off-Peak"))
            seasonalMultiplier = 0.7;
        else if(season.equalsIgnoreCase("Regular"))
            seasonalMultiplier = 1.0;
        else if(season.equalsIgnoreCase("Peak"))
            seasonalMultiplier = 1.5;
        else if(season.equalsIgnoreCase("Holiday"))
            seasonalMultiplier = 2.0;
        if(nightsBooked >=1 && nightsBooked <=4)
            extendedDiscount = 0;
        else if(nightsBooked <=7)
            extendedDiscount = 5;
        else if(nightsBooked <=14)
            extendedDiscount = 10;
        else
            extendedDiscount = 20;
        if(loyaltyTier.equalsIgnoreCase("None"))
            loyaltyDiscount = 0;
        else if(loyaltyTier.equalsIgnoreCase("Member"))
            loyaltyDiscount = 10;
        else if(loyaltyTier.equalsIgnoreCase("Gold"))
            loyaltyDiscount = 15;
        else if(loyaltyTier.equalsIgnoreCase("Platinum"))
            loyaltyDiscount = 20;
        double seasonalRate = baseRate * seasonalMultiplier;
        double discountedRate = seasonalRate * (1 - extendedDiscount/100.0) * (1 - loyaltyDiscount/100.0);
        double totalCost = discountedRate * nightsBooked;
        if(loyaltyTier.equalsIgnoreCase("Gold"))
            upgrades = "Late Checkout";
        else if(loyaltyTier.equalsIgnoreCase("Platinum"))
            upgrades = "Free Breakfast and Late Checkout";
        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.printf("Nightly Rate: $%.1f\n",discountedRate);
        System.out.printf("Total Booking Cost: $%.1f\n",totalCost);
        System.out.println("Complimentary Upgrades: " + upgrades);
    }
}