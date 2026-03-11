import java.util.Scanner;
public class  hotel {
    public static void main(String[] args){
        Scanner  revenue=new Scanner(System.in);
         int rooms,price,serviceCharges,commission;
         rooms=  revenue.nextInt();
         price=  revenue.nextInt();
         serviceCharges= revenue.nextInt();
         commission=  revenue.nextInt();
        int total_revenue=(rooms*price) + serviceCharges-commission;
        System.out.println( total_revenue);
    }
}