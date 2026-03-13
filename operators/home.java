import java.util.Scanner;
public class home{
    public static void main(String[] args){
        Scanner alert=new Scanner(System.in);
        int unitsConsumed,voltageFluctuation;
        unitsConsumed=alert.nextInt();
        voltageFluctuation=alert.nextInt();
        System.out.println((unitsConsumed>500 || voltageFluctuation==1)? "Alert": "Normal");
    }
}