import java.util.Scanner;

public class StudentApp {
       public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       Student record = new Student[100];
       
       System.out.println("Enter Student Id: ")
       int id = input.nextInt();
       input.nextLine();
              
       System.out.println("Enter First Name: ");
       String name = input.nextLine();
       
       System.out.println("Enter Last Name: ");
       String last = input.nextLine();
       
       System.out.println("Enter Course: ");
       String crs = input.nextLine();
       
       System.out.println("Enter Year Level: ");
       int lvl = input.nextInt();
       

   }
}