import java.util.Scanner;

public class printIndexed {
    public static void main(String[] args) {
        System.out.println("Please input a string to us:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print(s.length() -1 -i);
        }
        scanner.close();
    }
}



/*
From this code, I learned how to use scanner s.chartAt(i) and s.length()
So, let talk about the scanner frist, it is a function that allows us to get String
from our keyboard. And We have multiple examples how we use it:

 we use: Scanner scanner = new Scanner(System.in);  to get input
     1: String s = scanner.nextLine();  This function allows us get one sentence from keyboard
     2: int n = scanner.nextInt();      This function allows us get Integer number.
     3: double d = scanner.nextDouble();  This function allows us get double type number.



Then, let us talk about the s.charAt(i):
s.length() this function allows us get the length of one string.
s.charAt(i) this function allows us get the exact i(th) character of a string.


and by the way, char means a single character. It is a type of String.

 */
