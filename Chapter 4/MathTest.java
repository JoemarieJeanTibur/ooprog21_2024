import java.util.Scanner;
import java.lang.Math;

    public class MathTest {

        public static void main(String[] args) {

            Scanner tibur = new Scanner(System.in);

            System.out.print("SQRT of: " );
            double sqrt = tibur.nextDouble();
            double result = Math.sqrt(sqrt);

            System.out.print("SIN of: ");
            double sin = tibur.nextDouble();
            double result1 = Math.sin(sin);

            System.out.print("COS of: ");
            double cos = tibur.nextDouble();
            double result2 = Math.cos(cos);

            System.out.print("FLOOR of: ");
            double floor = tibur.nextDouble();
            double result3 = Math.floor(floor);

            System.out.print("CEIL of: ");
            double ceil = tibur.nextDouble();
            double  result4 = Math.ceil(ceil);

            System.out.print("ROUND of: ");
            int round = tibur.nextInt();
            int result5 = Math.round(round);

            System.out.print("MAX of: ");
            int max = tibur.nextInt();
            System.out.print("MIN of: ");
            int min = tibur.nextInt();
            int result6 = Math.max(max, min);
            int result7 = Math.min(max, min);

            //System.out.print("RAndom: ");
            //double random = math.nextDouble();
            double random = Math.random();

            System.out.println("");
            
            System.out.println("SQRT: " + result);
            System.out.println("SIN: " + result1);
            System.out.println("COS: " +  result2);
            System.out.println("FLOOR: " + result3);
            System.out.println("CEIL: " + result4);
            System.out.println("ROUND: " + result5);
            System.out.println("MAX: " + result6);
            System.out.println("MIN: " + result7);
            System.out.println("RANDOM: "  + random);


          tibur.close();

        }
    }