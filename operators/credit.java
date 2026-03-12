import java.util.Scanner;
public class credit{
    public static void main(String[] args){
        Scanner card=new Scanner(System.in);
        int creditLimit,purchaseAmount,cardBlocked;
        creditLimit=card.nextInt();
        purchaseAmount=card.nextInt();
        cardBlocked=card.nextInt();
        System.out.println(( purchaseAmount<=creditLimit && cardBlocked==0)? "Approved": "Declined");
    }
}