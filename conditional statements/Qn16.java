import java.util.*;
import java.util.Scanner;
public class Qn16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine();
        String loyaltyTier = sc.nextLine();
        double baseRate = 0;
        double seasonalMultiplier = 1.0;
        int extendedDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrade = "None";
        if(roomCategory.equalsIgnoreCase("Standard")){
            baseRate = 150;
        }
        else if(roomCategory.equalsIgnoreCase("Deluxe")){
            baseRate = 300;
        }
        else if(roomCategory.equalsIgnoreCase("Suite")){
            baseRate = 500;
        }
        else if(roomCategory.equalsIgnoreCase("Presidential")){
            baseRate = 1000;
        }
        if(season.equalsIgnoreCase("Off-Peak")){
            seasonalMultiplier = 0.7;
        }
        else if(season.equalsIgnoreCase("Regular")){
            seasonalMultiplier = 1.0;
        }
        else if(season.equalsIgnoreCase("Peak")){
            seasonalMultiplier = 1.5;
        }
        else if(season.equalsIgnoreCase("Holiday")){
            seasonalMultiplier = 2.0;
        }
        if(nightsBooked >= 1 && nightsBooked <= 4){
            extendedDiscount = 0;
        }
        else if(nightsBooked <= 7){
            extendedDiscount = 5;
        }
        else if(nightsBooked < 14){
            extendedDiscount = 10;
        }
        else{
            extendedDiscount = 20;
        }
        if(loyaltyTier.equalsIgnoreCase("None")){
            loyaltyDiscount = 0;
        }
        else if(loyaltyTier.equalsIgnoreCase("Member")){
            loyaltyDiscount = 10;
        }
        else if(loyaltyTier.equalsIgnoreCase("Gold")){
            loyaltyDiscount = 15;
        }
        else if(loyaltyTier.equalsIgnoreCase("Platinum")){
            loyaltyDiscount = 20;
        }
        double seasonalRate = baseRate * seasonalMultiplier;
        double discountedRate = seasonalRate * (1 - extendedDiscount/100.0) * (1 - loyaltyDiscount/100.0);
        double totalCost = discountedRate * nightsBooked;
        if(loyaltyTier.equalsIgnoreCase("Platinum")){
            if(roomCategory.equalsIgnoreCase("Presidential")){
                upgrade = "Concierge service, airport transfer, and fine dining";
            }
            else if(roomCategory.equalsIgnoreCase("Suite")){
                upgrade = "Luxury spa access and airport transfer";
            }
            else if(roomCategory.equalsIgnoreCase("Deluxe")){
                upgrade = "Upgraded to Suite";
            }
            else{
                upgrade = "Upgraded to Deluxe Room";
            }
        }
        else if(loyaltyTier.equalsIgnoreCase("Gold")){
            if(roomCategory.equalsIgnoreCase("Standard")){
                upgrade = "Upgraded to Deluxe Room";
            }
            else if(roomCategory.equalsIgnoreCase("Deluxe")){
                upgrade = "Free breakfast and spa access";
            }
            else{
                upgrade = "Free premium services";
            }
        }
        else if(loyaltyTier.equalsIgnoreCase("Member")){
            upgrade = "Free Breakfast";
        }
        else{
            upgrade = "None";
        }
        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.printf("Nightly Rate: %.1f$\n",discountedRate);
        System.out.printf("Total Booking Cost: %.1f$\n" ,totalCost);
        System.out.println("Complimentary Upgrades: " + upgrade);
    }
}