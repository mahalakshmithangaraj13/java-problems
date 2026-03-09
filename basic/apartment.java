import java.util.Scanner;
public class apartment{
    public static void main(String[]args){
        Scanner collection=new Scanner(System.in);
        int maintenance,parking,hall,security,electricity,cleaning;
        maintenance= collection.nextInt();
        parking=collection.nextInt();
        hall= collection.nextInt();
        security= collection.nextInt();
        electricity=collection.nextInt();
        cleaning=collection.nextInt();
        int balance=maintenance + parking+ hall-security-electricity-cleaning;

        System.out.println(balance);
    }
}