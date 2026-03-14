import java.util.Scanner;
public class toggle{
    public static void main(String[] args){
        Scanner digital=new Scanner(System.in);
        int signalValue,toggleMask;
        signalValue=digital.nextInt();
        toggleMask=digital.nextInt();
        int result=signalValue^toggleMask;
        System.out.println(result);
    }
}