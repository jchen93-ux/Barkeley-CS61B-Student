import java.util.Scanner;
public class quadrant {
    public static int Quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        }
        else if (x < 0 && y > 0) {
            return 2;
        }
        else if (x < 0 && y < 0) {
            return 3;
        }
        else if (x > 0 && y < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }
        public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter x here:");
          double x = scanner.nextDouble();

          System.out.println("Please enter y here:");
          double y = scanner.nextDouble();

          int result = Quadrant(x, y);

          System.out.println("quadrant:"  + result);

          scanner.close();
        }
        }






/*
import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x in this time:");
        double x = scanner.nextDouble();

        System.out.println("Please enter y in this time:");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println(" The coordinates you entered are in the first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println(" The coordinates you entered are in the Second quadrant");
        }
        else if (x < 0 && y < 0) {
            System.out.println(" The coordinates you entered are in the third quadrant");
        }
        else if (x > 0 && y < 0) {
            System.out.println(" The coordinates you entered are in the fourth quadrant");
        }
        else{
            System.out.println(" This pint is at the X or Y line");
        }
    }
}
 */


/*
Some questions here:
frist Class name can not be same as public static name, they should be different
Second: what do we do here : int result = Quadrant(x, y);
so we return the result from quadrant.
*/

