import java.util.Scanner;
public class security{
    public static void main(String[] args){
        Scanner merge=new Scanner(System.in);
        int permissionA,permissionB;
        permissionA=merge.nextInt();
        permissionB=merge.nextInt();
        int result=permissionA| permissionB;
        System.out.println(result);
    }
}