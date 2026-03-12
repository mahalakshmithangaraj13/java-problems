import java.util.Scanner;
public class trip{
    public static void main(String[] args){
        Scanner fuel=new Scanner(System.in);
        int distance,mileage,fuelPrice,tollCharge;
        distance=fuel.nextInt();
        mileage=fuel.nextInt();
        fuelPrice=fuel.nextInt();
        tollCharge=fuel.nextInt();
        int fuel_need=distance/mileage;
        int price=fuel_need*fuelPrice;
        System.out.println(price+tollCharge);
    }
}