import javax.swing.JOptionPane;

public class MovieQuoteInfo {

    public static void main(String[] args) {
    
        int year = 2007;
        String movie = "August Rush";
        String quote = "The music is all around us, all you have to do is listen.";
        String character = "Evan Taylor";
        
        String message = "Year: " + year + "\n" +
                         "Movie: " + movie + "\n" +
                         "Quote: " + quote + "\n" +
                         "Character: " + character + "\n";

        JOptionPane.showMessageDialog(null, message, "Favorite Movie Quote", JOptionPane.INFORMATION_MESSAGE);
    }
}


                       
                         
      
      
      
