import java.util.Scanner;
public class PurchaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5];

        for (int i = 0; i < purchases.length; i++) {
            int invoiceNumber;
            double saleAmount;

            while (true) {
                System.out.print("Enter invoice number for purchase " + (i + 1) + " (1000-8000): ");
                invoiceNumber = scanner.nextInt();

                System.out.print("Enter sale amount for purchase " + (i + 1) + " (non-negative): ");
                saleAmount = scanner.nextDouble();

                if (invoiceNumber >= 1000 && invoiceNumber <= 8000 && saleAmount >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid values.");
                }
            }
            purchases[i] = new Purchase(invoiceNumber, saleAmount);
        }

        System.out.println("\nPurchase Details:");
        for (int i = 0; i < purchases.length; i++) {
            System.out.println("Purchase " + (i + 1) + ":");
            System.out.println("  Invoice Number: " + purchases[i].getInvoiceNumber());
            System.out.println("  Sale Amount: $" + purchases[i].getSaleAmount());
            System.out.println("  Sales Tax: $" + purchases[i].getSalesTax());
        }

        scanner.close();
    }
}