import java.util.*;
import java.util.Scanner;
public class Qn22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();
        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;
        double tier1 = 0, tier2 = 0, tier3 = 0, tier4 = 0;
        int seasonalAdj = 0;
        int paymentDiscount = 0;
        if(customerType.equalsIgnoreCase("Residential")){
            rate1 = 0.10; rate2 = 0.15; rate3 = 0.25; rate4 = 0.30;
        }
        else if(customerType.equalsIgnoreCase("Commercial")){
            rate1 = 0.12; rate2 = 0.18; rate3 = 0.25; rate4 = 0.25;
        }
        else if(customerType.equalsIgnoreCase("Industrial")){
            rate1 = 0.08; rate2 = 0.12; rate3 = 0.20; rate4 = 0.20;
        }
        if(units > 0){
            if(units <= 100){
                tier1 = units * rate1;
            }
            else{
                tier1 = 100 * rate1;

                if(units <= 300){
                    tier2 = (units - 100) * rate2;
                }
                else{
                    tier2 = 200 * rate2;

                    if(units <= 500){
                        tier3 = (units - 300) * rate3;
                    }
                    else{
                        tier3 = 200 * rate3;
                        tier4 = (units - 500) * rate4;
                    }
                }
            }
        }
        if(season.equalsIgnoreCase("Summer")){
            seasonalAdj = 15;
        }
        else if(season.equalsIgnoreCase("Winter")){
            seasonalAdj = -10;
        }
        else{
            seasonalAdj = 0;
        }
        if(paymentMethod.equalsIgnoreCase("Auto-Pay")){
            paymentDiscount = 5;
        }
        else if(paymentMethod.equalsIgnoreCase("Online")){
            paymentDiscount = 3;
        }
        else{
            paymentDiscount = 0;
        }
        double total = tier1 + tier2 + tier3 + tier4;
        total = total * (1 + seasonalAdj / 100.0);
        total = total * (1 - paymentDiscount / 100.0);
        double avgRate = (units == 0) ? 0 : total / units;
        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.printf("Tier 1 Cost (0-100): $%.2f\n", tier1);
        System.out.printf("Tier 2 Cost (101-300): $%.2f\n", tier2);
        System.out.printf("Tier 3 Cost (301-500): $%.2f\n", tier3);
        System.out.printf("Tier 4 Cost (501+): $%.2f\n", tier4);
        System.out.println("Seasonal Adjustment: " + seasonalAdj + "%");
        System.out.println("Payment Discount: " + paymentDiscount + "%");
        System.out.printf("Total Bill: $%.2f\n", total);
        System.out.printf("Average Rate: $%.2f/kWh\n", avgRate);
    }
}