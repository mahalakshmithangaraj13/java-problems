import java.util.*;
import java.util.Scanner;
public class Qn04 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rate=0;
        double bonus=0.0;
        double total=0.0;
        double high=0.0;
        double commission=0.0;
        double totalSales = 0;
        double totalCommission = 0;
        String topPerformer="";
        for (int i=0;i<n;i++){
            String Name =scan.next();
            int amount= scan.nextInt();
            if(amount>=0 && amount<=40000){
                rate=5;
            }
            else if(amount>=40001 && amount<=80000){
                rate=8;
            }
            else if(amount>=80001 && amount<=100000){
                rate=10;
            }
            else if(amount>=100001 && amount<=150000){
                rate=10;
            }
            else {
                rate=15;
            }
        commission= amount*(rate/100.0);
        if(amount>=100000){
            bonus=2000;
        }
        else if(amount>=150000){
            bonus=3000;
        }
        total=commission+bonus;
        totalSales += amount;
        totalCommission +=commission;
        if(amount>high){
            high=amount;
            topPerformer=Name;
        }
        System.out.println("Sales Rep: "+Name);
        System.out.println("Sales Amount: $"+amount);
        System.out.println("Commission Rate:"+rate+"%");
        System.out.println("Commission Earned: $"+commission);
        System.out.println("Bonus: $"+bonus);
        System.out.println("Total Payout: $"+total);
        System.out.println();
        }
    System.out.println("Total Sales Reps:"+n);
    System.out.println("Total Sales: $"+totalSales);
    System.out.println("Total Commission: $"+totalCommission);
    System.out.println("Top Performer: "+topPerformer);
    }
}
