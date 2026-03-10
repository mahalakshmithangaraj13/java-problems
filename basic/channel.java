import java.util.Scanner;
public class channel{
    public static void main(String[]args){
        Scanner income=new Scanner(System.in);
        int ads,sponsor,affiliate,tax,production;
        ads=income.nextInt();
        sponsor=income.nextInt();
        affiliate= income.nextInt();
        tax= income.nextInt();
        production=income.nextInt();
        int final_income= ads+ sponsor+ affiliate-tax-production;
        System.out.println(final_income);
    }
}