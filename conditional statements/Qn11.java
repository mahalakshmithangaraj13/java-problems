import java.util.*;
import java.util.Scanner;
public class Qn11{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String orderType=scan.nextLine();
        String loyalty=scan.nextLine();
        double orderValue=scan.nextDouble();
        scan.nextLine();
        String timeSlot=scan.nextLine();
        int baseDiscount=0;
        int extraDiscount=0;
        double serviceFee=0;
        int prepTime=0;
        String priority="";
        if (loyalty.equalsIgnoreCase("Gold")) {
            baseDiscount = 15;
        } else if (loyalty.equalsIgnoreCase("Silver")) {
            baseDiscount = 10;
        } else if (loyalty.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else {
            baseDiscount = 0;
        }
        if (timeSlot.equalsIgnoreCase("Peak")) {
            extraDiscount = 0;
        }
        else if (timeSlot.equalsIgnoreCase("Regular")) {
            extraDiscount = 0;
        }
        else if (timeSlot.equalsIgnoreCase("Late-Night")) {
            extraDiscount = -5;
        }
        double totalDiscount = baseDiscount + extraDiscount;
        if (orderType.equalsIgnoreCase("Delivery")) {
            serviceFee = orderValue * 0.10;
        } 
        else if (orderType.equalsIgnoreCase("Takeout")) {
            serviceFee = orderValue * 0.03;
        } 
        else {
            serviceFee = 0;
        }
    double discountedValue = orderValue * (1 - totalDiscount / 100);
    double finalAmount = discountedValue + serviceFee;
        if (timeSlot.equalsIgnoreCase("Peak") && orderType.equalsIgnoreCase("Delivery")) {
            priority = "High";
        }
        else if (timeSlot.equalsIgnoreCase("Regular")) {
            priority = "Medium";
        }
        else if (timeSlot.equalsIgnoreCase("Late-Night")) {
            priority = "Low";
        }
        if (priority.equalsIgnoreCase("High")) {
            prepTime = 30;
        }
        else if (priority.equalsIgnoreCase("Medium")) {
            prepTime = 25;
        }
        else if(priority.equalsIgnoreCase("low")){
            prepTime = 15;
        }
        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: "+loyalty);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: "+ timeSlot);
        System.out.println("base Discount: "+ baseDiscount+"%");
        System.out.println("Time-Based Adjustment: " +extraDiscount+"%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");
    }
}