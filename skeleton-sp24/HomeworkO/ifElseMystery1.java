
public class ifElseMystery1{
  public static void IfElseMystery1(int x, int y) {
    int z = 4;
    if (z <= x) {
        z = x + 1;
    } else {
        z = z + 9;
    }
    if (z <= y) {
        y++;
    }
    System.out.println(z + " " + y);
}

public static void main(String[] args) {
    System.out.print("mystery(3, 20): ");
    IfElseMystery1(3, 20);

    System.out.print("mystery(6, 2): ");
    IfElseMystery1(6, 2);

    System.out.print("mystery(5, 5): ");
    IfElseMystery1(5, 5);
}
}

/* what would happen if we put:
mystery(3, 20);
mystery(6, 2);
mystery(5, 5);


(13, 21)
(7, 2)
(6， 5)

 */

