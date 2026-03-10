import java.util.Scanner;
public class  cinema {
    public static void main(String[] args){
        Scanner profit=new Scanner(System.in);
         int ticketRevenue,snackRevenue,maintenance,electricity;
        ticketRevenue= profit.nextInt();
        snackRevenue= profit.nextInt();
        maintenance=profit.nextInt();
        electricity= profit.nextInt();
        int net_profit= ticketRevenue + snackRevenue-maintenance-electricity;
        System.out.println(net_profit);
    }
}