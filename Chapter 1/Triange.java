
public class Triange {
    
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            
            for(int a=1; a<=7-i; a++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i*2-1; j++){
                System.out.print("T");
            }
            
            System.out.println();
            
        }
    }
    
}
