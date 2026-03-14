import java.util.Scanner;
public class scholarship{
    public static void main(String[] args){
        Scanner login=new Scanner(System.in);
        int usernameMatch,passwordMatch,accountLocked;
        usernameMatch= login.nextInt();
        passwordMatch=login.nextInt();
        accountLocked= login.nextInt();
        System.out.println((usernameMatch==1 && passwordMatch==1));
    }
}