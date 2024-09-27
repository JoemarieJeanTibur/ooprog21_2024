public class Billing {

    private static final double TAX_RATE = 0.08;

    public double computeBill(double price) {
        return price * (1 + TAX_RATE);
    }

    public double computeBill(double price, int quantity) {
        return price * quantity * (1 + TAX_RATE);
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = subtotal * (couponDiscount / 100.0);
        double total = (subtotal - discount) * (1 + TAX_RATE);
        return total;
    }

    public static void main(String[] args) {
        Billing billing = new Billing();

        double total1 = billing.computeBill(23.2);
        double total2 = billing.computeBill(24.4, 2);
        double total3 = billing.computeBill(40.45, 2, 10);

        System.out.println("The total price for the bill is: $" + total1);
        System.out.println("The total price for the bill is: $" + total2);
        System.out.println("The total price for the bill is: $" + total3);
    }
}