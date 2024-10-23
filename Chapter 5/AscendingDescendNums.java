import java.util.Scanner;

public class AscendingDescendNums{

    public static void main(String[] a) {

        Scanner tibur = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = tibur.nextInt();

        System.out.print("Enter second nnumber: ");
        int num2 = tibur.nextInt();

        System.out.print("Enter third number: ");
        int num3 = tibur.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }

        tibur.close();

    }
}