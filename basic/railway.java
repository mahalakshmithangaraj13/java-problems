import java.util.Scanner;
public class railway {
    public static void main(String[] args){
        Scanner ticket=new Scanner(System.in);
         int genPass,genFare,acPass,acFare,platform,maintenance,fuel;
         genPass= ticket.nextInt();
         genFare= ticket.nextInt();
         acPass=ticket.nextInt();
        acFare=ticket.nextInt();
        platform=ticket.nextInt();
        maintenance=ticket.nextInt();
        fuel= ticket.nextInt();
        int Net_Revenue =(genPass*genFare)+(acPass*acFare)+ platform-maintenance-fuel;
        System.out.println(Net_Revenue);
    }
}