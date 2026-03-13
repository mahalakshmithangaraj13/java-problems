import java.util.Scanner;
public class employee{
    public static void main(String[] args){
        Scanner bonus=new Scanner(System.in);
        int workingHours,attendancePercentage;
        workingHours=bonus.nextInt();
        attendancePercentage=bonus.nextInt();
        System.out.println(( workingHours>40 && attendancePercentage>90)? "Eligible": "Not Eligible");
    }
}