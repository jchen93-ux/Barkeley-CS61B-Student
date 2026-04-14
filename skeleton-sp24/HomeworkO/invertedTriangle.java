public class invertedTriangle{
    public static void main(String[] args) {
        String col = "*****";

        while (col.length() > 0){
            System.out.println(col);
            col = col.substring(0, col.length() - 1);
        }
        System.out.println();
    }
}

/* another way

public class invertedTriangle{
   public static void main(String[] args){
     String col = "*****";

     while(col.length() > 0)
       System.out.println(col);
       col = col.substring(0, col.length() -1);


and also:

public class startTriangle {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    }
}

 */


/*
We are required to design an invertedTriangle
Like this one:

*****
****
***
**
*

 */


/*
public class invertedTriangle{
    public static void main(String[] args){
        String col = "*****";
        int row = 6;
        while (row > 1) {
            System.out.println(col);
            col = col.substring(0, col.length() - 1);
            row--;
        }
    }
}
 */
