import java.util.Scanner;
public class shipping{
    public static void main(String[] args){
        Scanner charges=new Scanner(System.in);
        int cartValue,premiumMember;
        cartValue=charges.nextInt();
        premiumMember=charges.nextInt();
        System.out.println((cartValue>999 || premiumMember==1)? "Free Shipping": "Charges Applied");
    }
}