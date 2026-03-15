import java.util.*;
import java.util.Scanner;
public class Qn08{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String locationtier=scan.nextLine();
    int SquareFootage=scan.nextInt();
    int propertyAge=scan.nextInt();
    int amenityScore=scan.nextInt();
    double base_price=0;
    int adjustment=0;
    //location
    if(locationtier.equalsIgnoreCase("prime")){
         base_price=400;
    }
    else if(locationtier.equalsIgnoreCase("urban")){
        base_price=300;
    }
    else if(locationtier.equalsIgnoreCase("suburban")){
        base_price=180;
    }
    else if(locationtier.equalsIgnoreCase("rural")){
        base_price=100;
    }
    double baseValue=base_price*SquareFootage;
    //age
    if(propertyAge>0 && propertyAge<=5){
        adjustment=0;   
    }
    else if(propertyAge>=6 && propertyAge<=10){
        adjustment=-5; 
    }
    else if(propertyAge>=11 && propertyAge<=15){
        adjustment=-10; 
        }
    else if(propertyAge>=16 && propertyAge<=30){
        adjustment=15;
    }
    else if(propertyAge>=31) {
        adjustment=-25;   
    }
    double adjustedValue = baseValue * (1 + adjustment / 100.0);
     // Amenity bonus
        double amenityBonus = 0;

        if(amenityScore >= 80){
            amenityBonus = baseValue * 0.10;
        }
        else if(amenityScore >= 60){
            amenityBonus = baseValue * 0.05;
        }
        else if(amenityScore >= 40){
            amenityBonus =baseValue * 0.02;
        }
        else{
            amenityBonus = 0;
        }
        double finalValue = adjustedValue + amenityBonus;
         String marketCategory;

        if((locationtier.equalsIgnoreCase("Prime") || locationtier.equalsIgnoreCase("Urban")) && propertyAge < 15){
            marketCategory = "Hot";
        }
        else if(locationtier.equalsIgnoreCase("Suburban")){
            marketCategory = "Stable";
        }
        else{
            marketCategory = "Slow";
        }
         System.out.println("Location Tier: " + locationtier);
        System.out.println("Square Footage: " + SquareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + base_price);
        System.out.println("Age Adjustment: " + adjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

        scan.close();
    }
}