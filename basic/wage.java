import java.util.Scanner;
public class wage{
    public static void main(String[] args){
        Scanner week=new Scanner(System.in);
        int daysWorked,wagePerDay,overtimeBonus,maintenanceCharge;
        daysWorked=week.nextInt();
        wagePerDay=week.nextInt();
        overtimeBonus=week.nextInt();
        maintenanceCharge=week.nextInt();
        int salary=daysWorked*wagePerDay;
        int bonus=salary+overtimeBonus;
        System.out.println(bonus-maintenanceCharge);
    }
}