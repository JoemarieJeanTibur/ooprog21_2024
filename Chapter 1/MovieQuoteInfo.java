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

/*import javax.swing.JOptionPane;

   public class MovieQuoteInfor {
   
      public static void main(String[] args) {
      
      String quote = "The music is all around us, all you have to do is listen.";
      String movie = "August Rush";
      String character = "Evan Taylor";
      int year = 2007;
      
      String message = "Quote: " + quote + "\n" + "Movie: " + movie + "\n" + "Character" + character + "\n" +"Year: " + year;
                       
      JOptionPane.showMessageDialog(null, message, "Movie Quote", JOptionPane.INFORMATION_MESSAGE);
    }
}*/

                       
                         
      
      
      
