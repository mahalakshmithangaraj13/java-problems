import java.util.Scanner;
public class hospital {
    public static void main(String[] args){
        Scanner patient=new Scanner(System.in);
        int roomCharge,days,medicineCost,labFees,insuranceCoverage;
        roomCharge=patient.nextInt();
        days=patient.nextInt();
        medicineCost=patient.nextInt();
        labFees=patient.nextInt();
        insuranceCoverage=patient.nextInt();
        int result=(roomCharge*days)+medicineCost+labFees-insuranceCoverage;
        System.out.println(result);
    }
}