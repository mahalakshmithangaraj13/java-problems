import java.util.Scanner;
public class bank{
    public static void main(String[] args){
        Scanner loan=new Scanner(System.in);
        int salary,creditScore;
        salary=loan.nextInt();
        creditScore=loan.nextInt();
        System.out.println((salary>25000 && creditScore>700)? "Approved": "Rejected");
    }
}