import java.util.*;
import java.util.Scanner;
public class Qn10{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String timeOfDay=scan.nextLine();
        double powerConsumption=scan.nextDouble();
        double renewablePer=scan.nextDouble();
        scan.nextLine();
        String rateTier=scan.nextLine();
        double base=0;
        double rateMultiplier=0;
        String recommendation="";
        if(rateTier.equalsIgnoreCase("basic")){
             base=0.18;
        }
        else if(rateTier.equalsIgnoreCase("Time-of-use")){
            base=0.15;
        }
        else if(rateTier.equalsIgnoreCase("premium-green")){
            base=0.12;
        }
        if(timeOfDay.equalsIgnoreCase("Peak")){
              if (renewablePer >= 30) {
                rateMultiplier = 1.5;
            }
            else{
                rateMultiplier=1.8;
            }
        }
        else if(timeOfDay.equalsIgnoreCase("Off-Peak")){
            rateMultiplier = 1.0;
        }
        else if(timeOfDay.equalsIgnoreCase("Super-Off-Peak")){
            rateMultiplier = 0.6;
        }
        double renewableCredit = (powerConsumption * renewablePer/ 100) * base;
        double cost = (powerConsumption * base * rateMultiplier) - renewableCredit;
    if(timeOfDay.equalsIgnoreCase("Peak") && renewablePer< 20){
        recommendation = "Shift to Off-Peak";
    }
    else if(renewablePer >= 50){
        recommendation = "Excellent! Continue";
    }
    else if(rateTier.equalsIgnoreCase("Basic") && powerConsumption > 500){
        recommendation = "Upgrade to Time-of-Use";
    }
    double peakCost = powerConsumption * base* 1.6;
    double offPeakCost = powerConsumption * base* 0.9;
    double savings = peakCost - offPeakCost;
    System.out.println("Time of Day: "+timeOfDay);
    System.out.println("Power Consumption: "+powerConsumption);
    System.out.println("Renewable Energy: "+renewablePer+"%");
    System.out.println("Rate Tier: "+rateTier);
    System.out.println("Base Rate: $"+base+"/kWh");
    System.out.println("Rate Multiplier: "+rateMultiplier+"x");
    System.out.printf("Renewable Credit: $%.2f\n",renewableCredit);
    System.out.printf("Total Cost: $%.2f\n",cost);
    System.out.println("Optimization Recommendation: "+recommendation);
    System.out.printf("Potential Savings: $%.2f",savings);;
    }
}