import java.util.Scanner;
class salary_processing {
    public static void main(String[] args){
        Scanner salary=new Scanner(System.in);
        int month1,month2,month3,month4,month5;
        month1=salary.nextInt();
        month2=salary.nextInt();
        month3=salary.nextInt();
        month4=salary.nextInt();
        month5=salary.nextInt();
        System.out.println(month1+month2+month3-month4-month5);
    }
}