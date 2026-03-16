import java.util.*;
import java.util.Scanner;
public class Qn09{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double annualRevenue=scan.nextDouble();
        scan.nextLine();
        String businessType=scan.nextLine();
        double deductibleExpenses=scan.nextDouble();
        double taxCredits=scan.nextDouble();
        double taxableIncome=annualRevenue-deductibleExpenses;
        int tax=0;
        double grossTax=0;
        if(businessType.equalsIgnoreCase("C-Corp")){
            if(taxableIncome<=500000){
                tax=21;
            }
            else if(taxableIncome>500000 && taxableIncome<=1000000){
                tax=24;
            }
            else if(taxableIncome>1000000 && taxableIncome<=2000000){
                tax=28;
            }
            else if(taxableIncome>=2000000){
                tax=30;
            }
        }
        else if(businessType.equalsIgnoreCase("S-corp")){
            if(taxableIncome<=500000){
                tax=20;
            }
            else if(taxableIncome>500000 && taxableIncome<=1000000){
                tax=25;
            }
            else if(taxableIncome>=1000000){
                tax=28;
            }
        }
    else if(businessType.equalsIgnoreCase("LLC")){
            if(taxableIncome<200000){
                tax=15;
            }
            else if(taxableIncome>200000 && taxableIncome<=500000){
                tax=18;
            }
            else if(taxableIncome>=500000){
                tax=22;
            }
        }
        else if(businessType.equalsIgnoreCase("Partnership")){
            if(taxableIncome<300000){
                tax=18;
            }
            else if(taxableIncome>300000 && taxableIncome<=800000){
                tax=22;
            }
            else if(taxableIncome>=800000){
                tax=26;
            }
        }
    grossTax=(taxableIncome*tax)/100;
    double netTax=grossTax-taxCredits;
    if(netTax<0){
        netTax=0;
    }
    double EffectiveRate=(netTax/annualRevenue)*100;
    System.out.println("Annual Revenue: $"+annualRevenue);
    System.out.println("Business type: "+businessType);
    System.out.println("Deductible Expenses: $"+deductibleExpenses);
    System.out.println(" Tax Credits: $"+taxCredits);
    System.out.println("Taxable Income: $"+taxableIncome);
    System.out.println("Tax Rate: "+tax+"%");
    System.out.println("Gross tax: $"+grossTax);
    System.out.println("Net Tax After Credits: $"+netTax);
    System.out.printf("Effective Tax Rate: %.1f%%",EffectiveRate);
    }
}
