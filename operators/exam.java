import java.util.Scanner;
public class exam{
    public static void main(String[] args){
        Scanner evaluate=new Scanner(System.in);
        int theoryMarks,practicalMarks;
        theoryMarks=evaluate.nextInt();
        practicalMarks=evaluate.nextInt();
        int average=(theoryMarks+practicalMarks)/2;
        System.out.println((theoryMarks>=50 && practicalMarks>=50 && average>=60)? "pass": "fail");
    }
}