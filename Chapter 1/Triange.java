public class Triange {
    public static void main(String[] args) {
        int rows = 7;
         
         //rows for pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
                  
                  //  2 for double the T
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("T");
            }

            System.out.println();         }
    }
}
