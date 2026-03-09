import java.util.Scanner;
public class car{
    public static void main(String[]args){
        Scanner rent=new Scanner(System.in);
        int days,rentt,late,fuel,maintenance;
         days= rent.nextInt();
        rentt=rent.nextInt();
        late= rent.nextInt();
        fuel= rent.nextInt();
        maintenance=rent.nextInt();
        int profit= (days*rentt)+ late- fuel-maintenance;
        System.out.println(profit);
    }
}