import java.util.Scanner;
public class book{
    public static void main(String[]args){
        Scanner publish=new Scanner(System.in);
        int copies,cost,editing,design,commission,marketing;
        copies=publish.nextInt();
        cost=publish.nextInt();
        editing=publish.nextInt();
        design= publish.nextInt();
        commission= publish.nextInt();
        marketing= publish.nextInt();
        int Profit =(copies*cost)+ editing+ design- commission-marketing;

        System.out.println(Profit);
    }
}