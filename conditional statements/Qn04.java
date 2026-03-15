import java.util.*;
import java.util.Scanner;
public class Qn04{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String loyaltyTier=scan.nextLine();
        double cartValue=scan.nextDouble();
        scan.nextLine();
        String productCategory=scan.nextLine();
        String membershipStatus=scan.nextLine();
        int discount=0;
        int Specific_discount=0;
        if(loyaltyTier.equalsIgnoreCase("Bronze")){
              discount=5;
        }
        else if(loyaltyTier.equalsIgnoreCase("Silver")){
            discount=8;
        }
        else if(loyaltyTier.equalsIgnoreCase("Gold")){
            discount=12;
        }
        else if(loyaltyTier.equalsIgnoreCase("Platinum")){
            discount=15;
        }
        if(cartValue>=500 && cartValue<=999){
            Specific_discount=3;
        }
        else if(cartValue>=1000 && cartValue<=1999){
            Specific_discount=5;
        }
        else if(cartValue>=2000){
            Specific_discount=7;
        }
        if(productCategory.equalsIgnoreCase("Electronics")){
            if(membershipStatus.equalsIgnoreCase("prime")){
                Specific_discount+=5;
            }
        }
        else if(productCategory.equalsIgnoreCase("Fashion")){
            Specific_discount+=3;
        }
        else if(productCategory.equalsIgnoreCase("Books")){
            if(membershipStatus.equalsIgnoreCase("Prime")){
            Specific_discount+=5;
            }
        }
        else if(productCategory.equalsIgnoreCase("groceries")){
            if(cartValue>300){
                 Specific_discount+=2;
            }
        }
        int totalDiscount=discount+Specific_discount;
        double finall=(cartValue*totalDiscount)/100;
        double final_price=cartValue-finall;
        double savings=cartValue-final_price;
        System.out.println("Loyalty tier: "+loyaltyTier);
        System.out.println("Cart Value: $"+cartValue);
        System.out.println("Product Category: "+productCategory);
        System.out.println("Membership: "+membershipStatus);
        System.out.println("Base Discount: "+discount+"%");
        System.out.println("Additional Discount: "+Specific_discount+"%");
        System.out.println("Total Discount: "+totalDiscount+"%");
        System.out.println("Final Price: $"+final_price);
        System.out.println("Savings: $"+savings);
    }
}
