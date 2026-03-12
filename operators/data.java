import java.util.Scanner;
public class data{
    public static void main(String[] args){
        Scanner size=new Scanner(System.in);
        int fileSize,compressionCycles;
        fileSize=size.nextInt();
        compressionCycles=size.nextInt();
        int compressed_size=fileSize>>compressionCycles;
        System.out.println(compressed_size);
    }
}