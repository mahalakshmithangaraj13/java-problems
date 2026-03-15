import java.util.*;
import java.util.Scanner;
public class Qn05{
   public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    double gpa=scan.nextDouble();
    double familyIncome=scan.nextDouble();
    int extracuricular=scan.nextInt();
    scan.nextLine();
    String scholarshipType=scan.nextLine();
    String category="";
    double amount=0;
    String Eligible="";
    if(gpa>=2.5){
        if(scholarshipType.equalsIgnoreCase("Merit")){
        if(gpa>=3.8 && extracuricular>=80){
             category="Full";
             amount=25000;
             Eligible="Eligible";
        }
        else if(gpa>=3.5 && extracuricular>=70){
            category="Partial"; 
            amount=15000;
             Eligible="Eligible";
        }
        else if(gpa>=3.0 && extracuricular>=60){
             category="Minimal";
             amount=8000;
              Eligible="Eligible";
        }
        else{
            category="Null";
            amount=0;
             Eligible="Not Eligible";
        }
        }
        if(scholarshipType.equalsIgnoreCase("need-based")){
        if(familyIncome<=30000 && gpa>=3.5){
             category="Full";
             amount=30000;
              Eligible="Eligible";
        }
        else if(familyIncome<=50000 && gpa>=3.5){
            category="Partial";
            amount=18000;
             Eligible="Eligible";
        }
        else if(familyIncome<=70000 && gpa>=2.8){
            category="Minimal";
            amount=10000;
             Eligible="Eligible";
        }
        else{
            category="None";
            amount=0;
             Eligible="Not Eligible";
        }
        }
        if(scholarshipType.equalsIgnoreCase("Sports")){
        if(extracuricular>=85 && gpa>=3.0){
            category="Full";
            amount=22000;
             Eligible="Eligible";
        }
        else if(extracuricular>=75 && gpa>=2.8){
            category="Partial";
            amount=20000;
             Eligible="Eligible";
        }
        else if(extracuricular>65 && gpa>=2.5){
            category="Minimal";
            amount=12000;
             Eligible="Eligible";
        }
        else{
            category="None";
            amount=0;
             Eligible="Not Eligible";
        }
        }
    }
    System.out.println("GPA: "+gpa);
    System.out.println("Family Income: $"+familyIncome);
    System.out.println("Extracurricular Score: "+extracuricular);
    System.out.println("Scholarship Type: "+scholarshipType);
    System.out.println("Eligibilty: "+Eligible);
    System.out.println("Award Amount: $"+amount);
    System.out.println("Award Category: "+category);
   } 
}