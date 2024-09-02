import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's make it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner tibur = new Scanner(System.in);
        System.out.print("Enter the number of minutes rented: ");
        int rentMinutes;
        rentMinutes = tibur.nextInt();

        int hours = rentMinutes / 60;
        int extraMinutes = rentMinutes % 60;
        int rentalCost = (hours * 40) + (extraMinutes * 1);


        System.out.println("Hours Rented:" + hours);
        System.out.println("Minutes Rented:" + extraMinutes);
        System.out.println("Rental Cost: $" + rentalCost);


    tibur.close();


    }
}
