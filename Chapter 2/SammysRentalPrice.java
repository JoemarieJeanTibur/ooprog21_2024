import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's make it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner event = new Scanner(System.in);
        int rentMinutes;
        System.out.print("Enter the number of minutes rented: ");
        rentMinutes = event.nextInt();

        int hours = rentMinutes / 60;
        int extraMinutes = rentMinutes % 60;
        int rentalCost = (hours * 40) + (extraMinutes * 1);


        System.out.println("Hours Rented:" + hours);
        System.out.println("Minutes Rented:" + extraMinutes);
        System.out.println("Rental Cost: $" + rentalCost);


    event.close();


    }
}