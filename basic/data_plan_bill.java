import java.util.Scanner;
public class data_plan_bill{
    public static void main(String[] args){
        Scanner data_plan = new Scanner(System.in);
        int baseCost,extraGB,ratePerGB,tax;
        baseCost=data_plan.nextInt();
        extraGB=data_plan.nextInt();
        ratePerGB=data_plan.nextInt();
        tax=data_plan.nextInt();
        int charges=extraGB*ratePerGB;
        float bill=baseCost+charges;
        float tax_amount=(bill*tax)/100;
        float total_bill=bill+tax_amount;
         System.out.println(total_bill);
    }
}