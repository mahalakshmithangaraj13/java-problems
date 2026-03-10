import java.util.Scanner;
public class factory{
    public static void main(String[] args){
        Scanner machine= new Scanner(System.in);
        int rodsperHour,hoursWorked,overtimeRods,rejectedRods;
        rodsperHour=machine.nextInt();
        hoursWorked=machine.nextInt();
        overtimeRods=machine.nextInt();
        rejectedRods=machine.nextInt();
        int result=rodsperHour*hoursWorked;
        answer=result+overtimeRods-rejectedRods;
        System.out.println(answer);
    }
}