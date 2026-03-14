import java.util.Scanner;
public class smart{
    public static void main(String[] args){
        Scanner bitmask=new Scanner(System.in);
        int connectionValue,applianceMask;
        connectionValue=bitmask.nextInt();
        applianceMask=bitmask.nextInt();
        System.out.println(((connectionValue & applianceMask)!=0)? "Active": "Inactive");
    }
}