
import java.util.Scanner;

public class TestLease{
    public static void main(String[] args) {

        Lease lease1 = getData();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease();

       // Lease lease = getData();

        //showValues(lease1);
        lease1.addPetFee(); // Add pet fee and call explainPetPolicy
        showValues(lease1); 
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);

    }
    
    public static Lease getData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tenant Name: ");
        String tenantName = sc.nextLine();

        System.out.print("Enter Apartment Number: ");
        int apartNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the amount of rent each month: ");
        double rentAmonth = sc.nextDouble();
        sc.nextLine();

        System.err.print("Enter lease in month: ");
        int leaseinMonth = sc.nextInt();
        sc.nextLine();

        System.out.println("");


        Lease newLease = new Lease(tenantName, apartNum, rentAmonth, leaseinMonth);
        
        return newLease;
        
        //sc.close();
    }

    public static void showValues(Lease lease) {
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartNum());
        System.out.println("Monthly Rent: " + lease.getRentAmonth());
        System.out.println("Lease Term: " + lease.getLeaseinMonth());
        System.out.println(); // Add a newline for readability
    }

   


    
}