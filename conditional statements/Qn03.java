import java.util.*;
import java.util.Scanner;
public class Qn03{
    public static void main(String[] args){
        Scanner team= new Scanner(System.in);
        int age=team.nextInt();
        team.nextLine();
        double base=0;
        double riskSurcharge=0;
        String smokingStatus=team.nextLine();
        String preExisting=team.nextLine();
        String coverageTier=team.nextLine();
        if(coverageTier.equalsIgnoreCase("basic")){
            if(age>=18 && age<=30){
                base=200;
            }
            else if(age>=31 && age<=50){
                base=250;
            }
            else if(age>=51 && age>=65){
                base=350;
            }
            else if(age>=66){
                base=400;
            }
        }
    if(coverageTier.equalsIgnoreCase("Standard")){
            if(age>=18 && age<=30){
                base=300;
            }
            else if(age>=31 && age<=50){
                base=350;
            }
            else if(age>=51 && age>=65){
                base=450;
            }
            else if(age>=66){
                base=550;
            }
        }
    if(coverageTier.equalsIgnoreCase("premium")){
            if(age>=18 && age<=30){
                 base=500;
            }
            else if(age>=31 && age<=50){
                base=600;
            }
            else if(age>=51 && age>=65){
                base=700;
            }
            else if(age>=66){
                base=800;
            }
    }
    if (smokingStatus.equalsIgnoreCase("Smoker") && preExisting.equalsIgnoreCase("Yes")) {
            riskSurcharge = base* 0.70;
        }
        else if (smokingStatus.equals("Smoker")) {
            riskSurcharge = base* 0.40;
        }
        else if (preExisting.equalsIgnoreCase("Yes")) {
            riskSurcharge = base* 0.30;
        }
        double totalPremium = base+ riskSurcharge;
         System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + base);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        team.close();
    }
}