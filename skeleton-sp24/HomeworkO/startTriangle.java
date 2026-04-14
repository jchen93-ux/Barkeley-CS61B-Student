public class startTriangle{
    public static void main(String[] args){
        String col = "*";

        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < i; j++);
            System.out.println(col);
            col += "*";
        }
        System.out.println();
    }

}

/*
another

 public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


       public class startTriangle {
    public static void main(String[] args) {
        String col = "*";
        int row = 1;
        while (row < 6) {
            System.out.println(col);
            col += "*";
            row++;
        }
    }
}
*/


/*
For this exercise, we are required to design one five lines startTriangle
like this, and use for nested loops
*
**
***
****
*****
 */

/*
public class startTriangle {
    public static void main(String[] args) {
        String col = "*";
        int row = 1;
        while (row < 6) {
            System.out.println(col);
            col += "*";
            row++;
        }
    }
}
 */
