import java.util.Scanner;
public class software{
    public static void main(String[]args){
        Scanner cost=new Scanner(System.in);
        int hours,rate,design,testing,advance;
        hours=cost.nextInt();
        rate=cost.nextInt();
        design=cost.nextInt();
        testing= cost.nextInt();
        advance=cost.nextInt();
        int Project_Cost =(hours*rate)+design+ testing-advance;
        System.out.println(Project_Cost);
    }
}