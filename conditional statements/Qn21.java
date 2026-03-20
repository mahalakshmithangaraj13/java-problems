import java.util.*;
import java.util.Scanner;
public class Qn21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationZone = sc.nextLine();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();
        double baseRate = 5.0;
        int zonePremium = 0;
        double vehicleSurcharge = 0;
        int membershipDiscount = 0;
        double dailyCap = 0;
        boolean capApplied = false;
        String rateCategory = "";
        if(locationZone.equalsIgnoreCase("Downtown")){
            zonePremium = 50;
        }
        else if(locationZone.equalsIgnoreCase("Business-District")){
            zonePremium = 30;
        }
        else if(locationZone.equalsIgnoreCase("Residential")){
            zonePremium = 0;
        }
        else if(locationZone.equalsIgnoreCase("Airport")){
            zonePremium = 100;
        }
        if(vehicleType.equalsIgnoreCase("Motorcycle")){
            vehicleSurcharge = -2;
        }
        else if(vehicleType.equalsIgnoreCase("Compact") || vehicleType.equalsIgnoreCase("Sedan")){
            vehicleSurcharge = 0;
        }
        else if(vehicleType.equalsIgnoreCase("SUV")){
            vehicleSurcharge = 3;
        }
        else if(vehicleType.equalsIgnoreCase("Oversized")){
            vehicleSurcharge = 5;
        }
        if(membershipStatus.equalsIgnoreCase("None")){
            membershipDiscount = 0;
        }
        else if(membershipStatus.equalsIgnoreCase("Monthly")){
            membershipDiscount = 20;
        }
        else if(membershipStatus.equalsIgnoreCase("Annual")){
            membershipDiscount = 25;
        }
        else if(membershipStatus.equalsIgnoreCase("VIP")){
            membershipDiscount = 30;
        }
        double hourlyRate = baseRate * (1 + zonePremium / 100.0) + vehicleSurcharge;
        double calculatedFee = hourlyRate * parkingHours;
        if(parkingHours >= 24){
            if(locationZone.equalsIgnoreCase("Downtown")){
                dailyCap = 150;
            }
            else if(locationZone.equalsIgnoreCase("Business-District")){
                dailyCap = 120;
            }
            else if(locationZone.equalsIgnoreCase("Residential")){
                dailyCap = 60;
            }
            else if(locationZone.equalsIgnoreCase("Airport")){
                dailyCap = 180;
            }
            capApplied = true;
        }
        double discountedFee = calculatedFee * (1 - membershipDiscount / 100.0);
        double finalFee;

        if(capApplied){
            finalFee = Math.min(discountedFee, dailyCap);
        } else {
            finalFee = discountedFee;
        }
        if(locationZone.equalsIgnoreCase("Residential")){
            rateCategory = "Standard";
        }
        else if(locationZone.equalsIgnoreCase("Business-District")){
            rateCategory = "Premium";
        }
        else{
            rateCategory = "Luxury";
        }
        System.out.println("Location Zone: " + locationZone);
        System.out.printf("Parking Duration: %.1f hours\n", parkingHours);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.printf("Base Hourly Rate: $%.1f\n", baseRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.printf("Vehicle Size Surcharge: $%.1f\n", vehicleSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.printf("Total Parking Fee: $%.1f\n", finalFee);
        System.out.println("Daily Cap Applied: " + (capApplied ? "Yes" : "No"));
        System.out.println("Rate Category: " + rateCategory);
    }
}