import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory(30);

        directory.addEntry("Joemarie", "09202627090");
        directory.addEntry("Mary", "09095433411");
        directory.addEntry("Jasmin", "09612822092");
        directory.addEntry("Bella", "09622373811");
        directory.addEntry("Althea", "09617356427");
        directory.addEntry("Ejhie", "09943726482");
        directory.addEntry("Arabella", "09225313887");
        directory.addEntry("Edgarlie", "09661445968");
        directory.addEntry("Shun", "09567893687");
        directory.addEntry("Jayden", "09202622484");

        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("Enter a name ('quit' to exit): ");
            name = scanner.nextLine();
            System.out.println();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            String phoneNumber = directory.findPhoneNumber(name);
            if (phoneNumber != null) {
                System.out.println("Phone number: " + phoneNumber);
            } else {
                System.out.print("Name not found. Enter phone number for " + name + ": ");
                String newPhoneNumber = scanner.nextLine();
                directory.addEntry(name, newPhoneNumber);
                System.out.println(name + " added to the directory.");
            }
        }

        scanner.close();
    }
}