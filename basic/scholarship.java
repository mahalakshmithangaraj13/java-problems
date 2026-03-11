import java.util.Scanner;
public class scholarship{
    public static void main(String[]args){
        Scanner fees=new Scanner(System.in);
        int tuitionFees,Scholarship,examFee,libraryFee;
        tuitionFees=fees.nextInt();
        Scholarship=fees.nextInt();
        examFee=fees.nextInt();
        libraryFee=fees.nextInt();
        int scholarship_amount=(tuitionFees*Scholarship)/100;
        System.out.println(tuitionFees-scholarship_amount+examFee+libraryFee);
    }
}