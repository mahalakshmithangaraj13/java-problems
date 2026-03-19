import java.util.*;
import java.util.Scanner;
public class Qn20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storageGB = sc.nextInt();
        int userCount = sc.nextInt();
        sc.nextLine();
        String backupFrequency = sc.nextLine();
        String supportTier = sc.nextLine();
        double baseStorageCost = 0;
        double perUserFee = 0;
        double backupPremium = 0;
        double supportFee = 0;
        double monthly, annual;
        if(storageGB <= 100) {
            baseStorageCost = storageGB * 0.05;
        }
        else if(storageGB <= 500) {
            baseStorageCost = (100 * 0.05) + ((storageGB - 100) * 0.04);
        }
        else if(storageGB <= 2000) {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + ((storageGB - 500) * 0.03);
        }
        else {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + ((storageGB - 2000) * 0.02);
        }
        if(userCount <= 10) {
            perUserFee = userCount * 5;
        }
        else if(userCount <= 50) {
            perUserFee = userCount * 4;
        }
        else {
            perUserFee = userCount * 3;
        }
        if(backupFrequency.equalsIgnoreCase("Daily")) {
            backupPremium = 0;
        }
        else if(backupFrequency.equalsIgnoreCase("Hourly")) {
            backupPremium = 15 + (0.5 * userCount);
        }
        else if(backupFrequency.equalsIgnoreCase("Real-Time")) {
            backupPremium = 50 + (1 * userCount);
        }
        if(supportTier.equalsIgnoreCase("Community")) {
            supportFee = 0;
        }
        else if(supportTier.equalsIgnoreCase("Standard")) {
            supportFee = 20;
        }
        else if(supportTier.equalsIgnoreCase("Priority")) {
            supportFee = 75;
        }
        else if(supportTier.equalsIgnoreCase("Enterprise")) {
            supportFee = 200;
        }
        monthly = baseStorageCost + perUserFee + backupPremium + supportFee;
        annual = monthly * 12 * 0.9;
        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.printf("Base Storage Cost: $%.2f\n", baseStorageCost);
        System.out.printf("Per-User Fee: $%.2f\n", perUserFee);
        System.out.printf("Backup Premium: $%.2f\n", backupPremium);
        System.out.printf("Support Fee: $%.2f\n", supportFee);
        System.out.printf("Monthly Subscription: $%.2f\n", monthly);
        System.out.printf("Annual Subscription: $%.2f (save 10%%)\n", annual);
        if(userCount == 1) {
            System.out.println("Recommended Plan: Personal");
            System.out.println("Basic storage, file sync");
        }
        else if(userCount <= 20) {
            System.out.println("Recommended Plan: Team");
            System.out.println("Version history, file sharing, basic analytics");
        }
        else if(userCount <= 100) {
            System.out.println("Recommended Plan: Business");
            System.out.println("Included Features: Advanced Security, Team Management");
        }
        else {
            System.out.println("Recommended Plan: Enterprise");
            System.out.println("Advanced security, compliance tools, dedicated support, API accesss");
        }

        sc.close();
    }
}