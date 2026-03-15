import java.util.*;
import java.util.Scanner;
public class Qn06{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String BookingClass=scan.nextLine();
        int DayUntilDeparture=scan.nextInt();
        double seatAvalabilty=scan.nextDouble();
        scan.nextLine();
        String routeType=scan.nextLine();
        double price=0;
        double demand=0;
        String category="";
        if(BookingClass.equalsIgnoreCase("Economy")){
            if(routeType.equalsIgnoreCase("Domestic")){
               price=200;
            }
            else if(routeType.equalsIgnoreCase("International-Short")){
                price=500;
            }
            else if(routeType.equalsIgnoreCase("International-Long")){
                price=800;
            }
        }
        else if(BookingClass.equalsIgnoreCase("Business")){
            if(routeType.equalsIgnoreCase("Domestic")){
               price=600;
            }
            else if(routeType.equalsIgnoreCase("Int-Short")){
                price=1500;
            }
            else if(routeType.equalsIgnoreCase("Int-Long")){
                price=2500;
            }
        }
        else if(BookingClass.equalsIgnoreCase("First")){
            if(routeType.equalsIgnoreCase("Domestic")){
               price=1000;
            }
            else if(routeType.equalsIgnoreCase("International-Short")){
                price=3000;
            }
            else if(routeType.equalsIgnoreCase("International-Long")){
                price=5000;
            }
        }
        if(seatAvalabilty<30 && DayUntilDeparture<14){
            demand=1.8;
            category="High Demand";
        }
        else if(seatAvalabilty<50 && DayUntilDeparture<30){
            demand=1.5;
            category="High Demand";
        }
        else if(seatAvalabilty<60 && DayUntilDeparture>30 && DayUntilDeparture<60){
            demand=1.0;
            category="Moderate";
        }
        else if(seatAvalabilty>=60 && DayUntilDeparture>60){
            demand=0.8;
            category="Low Demand";
        }
        double final_Income=price*demand;
        System.out.println("Booking Class: "+BookingClass);
        System.out.println("Days Until Departure: "+DayUntilDeparture);
        System.out.println("Seat Availabilty: "+seatAvalabilty+"%");
        System.out.println("Route Type: "+routeType);
        System.out.println("Base Price: $"+price);
        System.out.println("Demand Multiplier: "+demand+"x");
        System.out.println("Final Ticket Price: $"+final_Income);
        System.out.println("Pricing Category: "+category);
    }
}