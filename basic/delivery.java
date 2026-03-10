import java.util.Scanner;
public class delivery {
    public static void main(String[] args){
        Scanner service=new Scanner(System.in);
        int deliveries, payout, incentive, fuelCost;
         deliveries=service.nextInt();
         payout=service.nextInt();
         incentive= service.nextInt();
        fuelCost= service.nextInt();
        int result=(deliveries*payout) + incentive-fuelCost;
        System.out.println(result);
    }
}