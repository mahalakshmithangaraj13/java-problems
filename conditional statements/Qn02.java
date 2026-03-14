import java.util.*;
import java.util.Scanner;
public class Qn02{
    public static void main(String[] args){
        Scanner loan=new Scanner(System.in);
        int creditScore=loan.nextInt();
        double annualIncome=loan.nextDouble();
        double debtToIncomeratio=loan.nextDouble();
        loan.nextLine();
        String loanType=loan.nextLine();
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Annual Income: $"+annualIncome);
        System.out.println("Debt-to-Income Ratio: "+debtToIncomeratio+"%");
        System.out.println("Loan Type: "+loanType);
        if(loanType.equalsIgnoreCase("Home")){
            if(creditScore>=750 && debtToIncomeratio<=30){
                double decision=4*annualIncome;
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+decision);
        }
        else if(creditScore>=700 && creditScore<=749 && debtToIncomeratio>=31 && debtToIncomeratio<=40){
                double decision=3*annualIncome;
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+decision);
        }
        else if (creditScore >= 650 && creditScore <= 699 && debtToIncomeratio >= 31 && debtToIncomeratio <= 40) {
                double decision=3*annualIncome;
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+decision);   
                }
        else if(creditScore<600 || debtToIncomeratio>50){
        double decision=0*annualIncome;
                System.out.println("decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+decision);
    
        }
        }

    else if(loanType.equalsIgnoreCase("personal")){
        if(creditScore>=750 && debtToIncomeratio<=30){
                double decision=1*annualIncome;
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+decision);
            }
        else if(creditScore >= 650 && creditScore <= 699 && debtToIncomeratio >= 31 && debtToIncomeratio <= 40) {
                double decision=0.5*annualIncome;
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+decision);   
                }
        else if(creditScore<600 || debtToIncomeratio>50){
        double decision=0*annualIncome;
                System.out.println("decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+decision);
    
    }
        }
    else if(loanType.equalsIgnoreCase("Business")){
         if(creditScore>=700 && debtToIncomeratio<=40){
                double decision=3*annualIncome;
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+decision);
        }
        else if(creditScore<600 || debtToIncomeratio>50){
        double decision=0*annualIncome;
                System.out.println("decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+decision);
    
    }
    }
    }
    }