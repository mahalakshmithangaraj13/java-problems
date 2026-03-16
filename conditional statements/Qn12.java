import java.util.*;
import java.util.Scanner;
public class Qn12{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int DriverAge=scan.nextInt();
        scan.nextLine();
        String vehicleType=scan.nextLine();
        String drivingRecord=scan.nextLine();
        String coverageLevel=scan.nextLine();
        double basePremium=0;
        double ageFactor=0;
        double vehicleRisk=0;
        int recordAdjustment=0;
        String riskCategory="";
        if(coverageLevel.equalsIgnoreCase("Basic")){
            basePremium=500;
        }
        else if (coverageLevel.equalsIgnoreCase("Standard")) {
            basePremium = 800;
        }
        else if (coverageLevel.equalsIgnoreCase("Comprehensive")) {
            basePremium = 1500;
        }
        if (DriverAge >= 16 && DriverAge <= 21) {
            ageFactor = 1.8;
        }
        else if ( DriverAge >= 22 && DriverAge <= 25) {
            ageFactor = 1.5;
        }
        else if (DriverAge >= 26 && DriverAge <= 40) {
            ageFactor = 1.0;
        }
        else if (DriverAge >= 41 && DriverAge <= 60) {
            ageFactor = 0.9;
        }
        else {
            ageFactor = 1.1;
        }
        if (vehicleType.equalsIgnoreCase("Sedan")) {
            vehicleRisk = 1.0;
        }
        else if (vehicleType.equalsIgnoreCase("SUV")) {
            vehicleRisk = 1.2;
        }
        else if (vehicleType.equalsIgnoreCase("Sports")) {
            vehicleRisk = 1.5;
        }
        else if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicleRisk = 1.1;
        }
        if (drivingRecord.equalsIgnoreCase("Clean")) {
            recordAdjustment = -10;
        }
        else if (drivingRecord.equalsIgnoreCase("Minor-Violations")) {
            recordAdjustment = 25;
        }
        else if (drivingRecord.equalsIgnoreCase("Major-Violations")) {
            recordAdjustment = 50;
        }
        double adjustedPremium = basePremium * ageFactor * vehicleRisk;
        double finalPremium = adjustedPremium * (1 + recordAdjustment / 100);
        double monthlyPremium = finalPremium / 12;
        if (drivingRecord.equalsIgnoreCase("Major-Violations") || vehicleType.equalsIgnoreCase("Sports")) {
            riskCategory = "High Risk";
        }
        else if (drivingRecord.equalsIgnoreCase("Minor-Violations") || DriverAge < 25) {
            riskCategory = "Medium Risk";
        }
        else {
            riskCategory = "Low Risk";
        }
        System.out.println("Driver Age: " + DriverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: "+ ageFactor+"x");
        System.out.println("Vehicle Risk Factor: " + vehicleRisk+"x");
        System.out.println("Record Adjustment: " + recordAdjustment+"%");
        System.out.println("Monthly Premium: $" + monthlyPremium);
        System.out.println("Final Premium: $" + finalPremium);
        System.out.println("Risk Category: " + riskCategory);
    }
}