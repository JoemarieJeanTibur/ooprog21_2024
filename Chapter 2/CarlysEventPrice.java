import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {

        System.out.println("*****************************************************");
        System.out.println("");
        System.out.println("*    Carly's makes the food that makes it a party.   *");
        System.out.println("*                                                    *");
        System.out.println("*****************************************************");
        
        Scanner tibur = new Scanner(System.in);
        System.out.print("Enter the total number of guests: ");
        int numberGuests = tibur.nextInt();
        
        int pricePerGuest = 35;
        int totalPrice = numberGuests * pricePerGuest;
        
        boolean largeEvent = numberGuests >=50;
        
        System.out.println("Total Number of guests:" + numberGuests);
        System.out.println("Price per Guess: $" + pricePerGuest);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Is it a large event?");
        
       if (largeEvent) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }        
        
        
        tibur.close();
        
        
        
        
    }
}