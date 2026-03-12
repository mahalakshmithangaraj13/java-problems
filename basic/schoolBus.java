import java.util.Scanner;
public class schoolBus {
    public static void main(String[] args){
        Scanner fee=new Scanner(System.in);
        int distance,rate,maintenance,allowance,subsidy;
        distance=fee.nextInt();
        rate= fee.nextInt();
        maintenance= fee.nextInt();
        allowance=fee.nextInt();
        subsidy=fee.nextInt();
        int result=(distance *rate) + maintenance +allowance-subsidy;
        System.out.println(result);
    }
}