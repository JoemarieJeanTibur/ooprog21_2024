
import java.util.Scanner;

class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    public Purchase(int invoiceNumber, double saleAmount) {
        this.invoiceNumber = invoiceNumber;
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05; // Assuming sales tax is 5%
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public double getSalesTax() {
        return salesTax;
    }
}