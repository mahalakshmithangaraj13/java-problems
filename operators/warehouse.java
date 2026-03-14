import java.util.Scanner;
public class warehouse{
    public static void main(String[] args){
        Scanner capacity=new Scanner(System.in);
        int baseBoxes,levels;
        baseBoxes=capacity.nextInt();
        levels=capacity.nextInt();
        int capacityy=baseBoxes<<levels;
        System.out.println(capacityy);
    }
}