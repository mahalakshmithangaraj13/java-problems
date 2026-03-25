import java.util.*;
import java.util.Scanner;
public class Qn02{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        char grade='F';
        String status="";
        double sum=0.0;
        int high=0;
        int passCount=0;
        int failCount=0;
        for (int i=0;i<n;i++){
            String name= scan.next();
            int score= scan.nextInt();
            if(score>=85 && score<=100){
                grade='A';
            }
            else if(score>=70 && score<=84){
                grade='B';
            }
            else if(score>=60 && score<=69){
                grade='C';
            }
            else if(score>=50 && score<=59){
                grade='D';
            }
            else if(score>=0 && score<=49){
                grade='F';
            }
        if(score >=60){
             status="Pass";
             passCount++;
        }
        else if(score<69){
            status="Fail";
            failCount++;
        }
           sum=sum+score;
           high=Math.max(high,score);
           System.out.println("Student: "+name);
           System.out.println("Score: "+score);
           System.out.println("letter Grade: "+grade);
           System.out.println("Status: "+status);
           System.out.println();
        }
        double Average=sum/n;
        System.out.println("Total Students:"+n);
        System.out.println("Class Average: "+Average);
        System.out.println("Highest Score: "+high);
        System.out.println("Student Passed: "+passCount);
        System.out.println("Student Failed: "+failCount);
    }
}