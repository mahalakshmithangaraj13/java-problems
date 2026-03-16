import java.util.*;
import java.util.Scanner;
public class Qn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String membershipTier = sc.nextLine();
        int contractMonths = sc.nextInt();
        sc.nextLine();
        String accessLevel = sc.nextLine();
        String addOns = sc.nextLine();

        double baseFee = 0;
        int contractDiscount = 0;
        double accessFee = 0;
        double addOnFee = 0;
        if(membershipTier.equalsIgnoreCase("Basic")){
            baseFee = 40;
        }
        else if(membershipTier.equalsIgnoreCase("Premium")){
            baseFee = 80;
        }
        else if(membershipTier.equalsIgnoreCase("Elite")){
            baseFee = 120;
        }
        else if(membershipTier.equalsIgnoreCase("VIP")){
            baseFee = 150;
        }
        if(contractMonths == 1){
            contractDiscount = 0;
        }
        else if(contractMonths == 6){
            contractDiscount = 10;
        }
        else if(contractMonths == 12){
            contractDiscount = 15;
        }
        else if(contractMonths == 24){
            contractDiscount = 25;
        }
        if(accessLevel.equalsIgnoreCase("Single-Location")){
            accessFee = 0;
        }
        else if(accessLevel.equalsIgnoreCase("Regional")){
            accessFee = 20;
        }
        else if(accessLevel.equalsIgnoreCase("Nationwide")){
            accessFee = 50;
        }
        if(addOns.equalsIgnoreCase("None")){
            addOnFee = 0;
        }
        else if(addOns.equalsIgnoreCase("Personal-Training")){
            addOnFee = 100;
        }
        else if(addOns.equalsIgnoreCase("Classes")){
            addOnFee = 50;
        }
        else if(addOns.equalsIgnoreCase("Full-Package")){
            addOnFee = 200;
        }
        double discountedBase = baseFee * (1 - contractDiscount / 100.0);
        double monthlyTotal = discountedBase + accessFee + addOnFee;
        double contractTotal = monthlyTotal * contractMonths;
        double normalCost = (baseFee + accessFee + addOnFee) * contractMonths;
        double savings = normalCost - contractTotal;
        String category;

        if(membershipTier.equalsIgnoreCase("Basic")){
            category = "Budget";
        }
        else if(membershipTier.equalsIgnoreCase("Premium")){
            category = "Standard";
        }
        else if(membershipTier.equalsIgnoreCase("Elite")){
            category = "Premium";
        }
        else{
            category = "Luxury";
        }

        // Output
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Contract Length: " + contractMonths + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + contractDiscount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);
    }
}