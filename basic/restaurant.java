import java.util.Scanner;
public class restaurant{
    public static void main(String []args){
        Scanner food= new Scanner(System.in);
            int totalBill,service,gst,numberOfPeople;
            totalBill=food.nextInt();
            service=food.nextInt();
            gst=food.nextInt();
            numberOfPeople=food.nextInt();
            int service_amount=(totalBill*service)/100;
            float gst_bill=(service_amount*gst)/100;
            float amount=totalBill+service_amount+gst_bill;
            float result=amount/numberOfPeople;
            System.out.println(result);  
    }
}