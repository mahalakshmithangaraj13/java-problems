import java.util.*;
import java.util.Scanner;
public class Qn07{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int heartRate=scan.nextInt();
        scan.nextLine();
        String bp=scan.nextLine();
        double temperature=scan.nextDouble();
        scan.nextLine();
        String Sypmtom=scan.nextLine();
        String[] parts=bp.split("/");
        int systolic =Integer.parseInt(parts[0]);
        int diastolic=Integer.parseInt(parts[1]);
        String priority="";
        int waitTime=0;
        String action="";
        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            Sypmtom.equalsIgnoreCase("Life-Threatening")) {
            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }
            else if ((heartRate >= 50 && heartRate <= 60) ||
                (heartRate >= 110 && heartRate <= 130) ||
                (systolic >= 160 && systolic <= 180) ||
                (systolic >= 90 && systolic <= 100) ||
                (temperature >= 101 && temperature <= 103) ||
                (temperature >= 96 && temperature <= 97) ||
                Sypmtom.equalsIgnoreCase("Severe")) {

            priority = "Urgent";
            waitTime = 15;
            action = "Priority Medical Attention";
        }
        else if (Sypmtom.equalsIgnoreCase("Moderate")) {
            priority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
    }
        else {
            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + Sypmtom);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}