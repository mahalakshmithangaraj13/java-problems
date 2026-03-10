import java.util.Scanner;
public class college {
    public static void main(String[] args){
        Scanner fund=new Scanner(System.in);
         int registration,sponsorship,stall,stage,celebrity,marketing;
         registration= fund.nextInt();
        sponsorship= fund.nextInt();
        stall=fund.nextInt();
        stage= fund.nextInt();
        celebrity= fund.nextInt();
        marketing=fund.nextInt();
        int Remaining_Fund =registration + sponsorship+ stall- stage- celebrity- marketing;
        System.out.println(Remaining_Fund);
    }
}