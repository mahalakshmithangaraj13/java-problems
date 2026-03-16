import java.util.*;
import java.util.Scanner;
public class Qn13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();
        int creditHours = sc.nextInt();
        sc.nextLine();
        String program = sc.nextLine();
        String residency = sc.nextLine();
        double baseTuition = 0;
        double residencyMultiplier = 0;
        double programFee = 0;
        double activityFee = 0;
        if(program.equalsIgnoreCase("Undergraduate")){
            baseTuition = 350;
        }
        else if(program.equalsIgnoreCase("Graduate")){
            baseTuition = 550;
        }
        else if(program.equalsIgnoreCase("Professional")){
            baseTuition = 800;
        }
        if(residency.equalsIgnoreCase("In-State")){
            residencyMultiplier = 1.0;
        }
        else if(residency.equalsIgnoreCase("Out-of-State")){
            residencyMultiplier = 2.5;
        }
        else if(residency.equalsIgnoreCase("International")){
            residencyMultiplier = 3.0;
        }
        if(status.equalsIgnoreCase("Full-Time")){
            if(program.equalsIgnoreCase("Undergraduate")){
                programFee = 500;
            }
            else if(program.equalsIgnoreCase("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 1200;
            }
        }
        else if(status.equalsIgnoreCase("Part-Time")){
            if(program.equalsIgnoreCase("Undergraduate")){
                programFee = 300;
            }
            else if(program.equalsIgnoreCase("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 900;
            }
        }
        else if(status.equalsIgnoreCase("Continuing-Education")){
            programFee = 150;
        }
        if(status.equalsIgnoreCase("Full-Time")){
            activityFee = 200;
        }
        else if(status.equalsIgnoreCase("Part-Time")){
            activityFee = 100;
        }
        else{
            activityFee = 50;
        }
        double tuitionCost = creditHours * baseTuition * residencyMultiplier;
        double totalFee = tuitionCost + programFee + activityFee;
        String category;
        if(residency.equalsIgnoreCase("In-State") && status.equalsIgnoreCase("Full-Time")){
            category = "Standard";
        }
        else if(status.equalsIgnoreCase("Continuing-Education")){
            category = "Reduced";
        }
        else if(residency.equalsIgnoreCase("Out-of-State") || residency.equalsIgnoreCase("International")){
            category = "Premium";
        }
        else{
            category = "Standard";
        }
        System.out.println("Student Status: "+ status);
        System.out.println("Credit Hours: "+ creditHours);
        System.out.println("Program Type: "+ program);
        System.out.println("Residency: "+ residency);
        System.out.println("Base Tuition Per Credit: $" + baseTuition);
        System.out.println("Residency Multiplier: "+ residencyMultiplier+"x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + totalFee);
        System.out.println("Fee Category: " + category);
    }
}