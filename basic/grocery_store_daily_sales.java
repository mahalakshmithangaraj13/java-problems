import java.util.Scanner;
public class grocery_store_daily_sales{
    public static void main(String[] args){
    Scanner earnings= new Scanner(System.in);
    int sales,discount,gst;
    sales=earnings.nextInt();
    discount=earnings.nextInt();
    gst=earnings.nextInt();
    int discount_price=(sales*discount)/100;
    int discounted_sales=sales-discount_price;
    int gst_price=(gst*discounted_sales)/100;
    System.out.println(discounted_sales+gst_price);
}
}