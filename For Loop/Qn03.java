import java.util.*;
import java.util.Scanner;
public class Qn03{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String status="";
        int quantity=0;
        int lowCount=0;
        int criticalCount=0;
        int total=0;
        for (int i=0;i<n;i++){
            String name =scan.next();
            int curr_stock=scan.nextInt();
            int min_stock=scan.nextInt();
            if(curr_stock>=min_stock){
                status="Adequate";
                quantity=0;
            }
            else if((curr_stock< min_stock)&&(curr_stock>=(min_stock/2.0))){
                status="Low Stock";
                lowCount++;
                quantity=(int)((min_stock-curr_stock)+(min_stock/2.0));
            }
            else if(curr_stock<(min_stock/2)){
                status="critical";
                criticalCount++;
                quantity=(int)((min_stock - curr_stock)+(min_stock*1.5));
            }
            System.out.println("Product"+ name);
            System.out.println("Current Stock: " + curr_stock);
            System.out.println("Minimum Stock: " + min_stock);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + quantity);
            total+= quantity;
            System.out.println();
        }
         
        System.out.println("Total Products: " + n);
        System.out.println("Low Stock Items: " + lowCount);
        System.out.println("Critical Items: " + criticalCount);
        System.out.println("Total Reorder Quantity: " + total);
    }
}