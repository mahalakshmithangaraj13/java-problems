import java.util.Scanner;
public class gym {
    public static void main(String[] args){
        Scanner salary=new Scanner(System.in);
         int baseSalary,sessions,payPerSession,bonus,maintenanceFee;
         baseSalary= salary.nextInt();
         sessions= salary.nextInt();
         payPerSession= salary.nextInt();
         bonus= salary.nextInt();
         maintenanceFee=salary.nextInt();
        int main_Salary = baseSalary + (sessions*payPerSession) + bonus-maintenanceFee;
        System.out.println(main_Salary);
    }
}