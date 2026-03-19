import java.util.*;
import java.util.Scanner;
public class Qn19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();
        double basePrice = 12;
        double formatSurcharge = 0;
        double seatUpgrade = 0;
        int timeAdjustment = 0;
        int customerDiscount = 0;
        double baseWithSurcharges;
        double adjustedPrice;
        double finalPrice;
        String concessionVoucher = "No";
        String pricingCategory = "";
        if(movieFormat.equalsIgnoreCase("2D")){
            formatSurcharge = 0;
        }
        else if(movieFormat.equalsIgnoreCase("3D")){
            formatSurcharge = 5;
        }
        else if(movieFormat.equalsIgnoreCase("IMAX")){
            formatSurcharge = 8;
        }
        else if(movieFormat.equalsIgnoreCase("4DX")){
            formatSurcharge = 10;
        }
        if(seatCategory.equalsIgnoreCase("Standard")){
            seatUpgrade = 0;
        }
        else if(seatCategory.equalsIgnoreCase("Premium")){
            seatUpgrade = 4;
        }
        else if(seatCategory.equalsIgnoreCase("Recliner")){
            seatUpgrade = 7;
        }
        if(showTime.equalsIgnoreCase("Matinee")){
            timeAdjustment = -30;
        }
        else if(showTime.equalsIgnoreCase("Evening")){
            timeAdjustment = 0;
        }
        else if(showTime.equalsIgnoreCase("Prime-Time")){
            timeAdjustment = 20;
        }
        else if(showTime.equalsIgnoreCase("Late-Night")){
            timeAdjustment = -20;
        }
        if(customerType.equalsIgnoreCase("Adult")){
            customerDiscount = 0;
        }
        else if(customerType.equalsIgnoreCase("Senior")){
            customerDiscount = 25;
        }
        else if(customerType.equalsIgnoreCase("Student")){
            customerDiscount = 15;
        }
        else if(customerType.equalsIgnoreCase("Child")){
            customerDiscount = 30;
        }
 
        baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100.0);
        finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);
        if(showTime.equalsIgnoreCase("Matinee")){
            concessionVoucher = "Yes";
        }
        else{
            if(customerType.equalsIgnoreCase("Senior") ||
               customerType.equalsIgnoreCase("Student") ||
               customerType.equalsIgnoreCase("Child")){
                concessionVoucher = "Yes";
            }
        }
        if(finalPrice < 10){
            pricingCategory = "Value";
        }
        else if(finalPrice < 15){
            pricingCategory = "Standard";
        }
        else if(finalPrice < 20){
            pricingCategory = "Premium";
        }
        else{
            pricingCategory = "Luxury";
        }
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.printf("Final Ticket Price: %.1f$\n",finalPrice);
        System.out.println("Concession Voucher: " + concessionVoucher);
        System.out.println("Pricing Category: " + pricingCategory);

    }
}