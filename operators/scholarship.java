import java.util.Scanner;
public class scholarship{
    public static void main(String[] args){
        Scanner Eligible=new Scanner(System.in);
        int familyIncome,percentage;
        familyIncome= Eligible.nextInt();
        percentage=Eligible.nextInt();
        System.out.println((familyIncome<200000 && percentage>=75)? "Granted": "Not Granted");
    }
}