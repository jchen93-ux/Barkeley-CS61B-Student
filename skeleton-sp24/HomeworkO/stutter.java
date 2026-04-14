import java.util.Scanner;

public class stutter {
    public static String Stutter(String s){
        String result ="";

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string for us:");
        String s = scanner.nextLine();

        String output = Stutter(s);
        System.out.println(output);

        scanner.close();

    }
}





/*
Another way but with print() function:

import java.util.Scanner;

public class stutter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String s = scanner.nextLine();

        for( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = s.charAt(i);
            System.out.print(c);
            System.out.print(d);
        }

    }
}





Some reminds:
First: we must capitalize the class name of class.

Second: why don't we use void main function in the beginning? because void indicates that
the method does not return any value, so this is the reason why did we put void indicates
in the end of coding. and also main indicates must claim void indicate.

Third: why did we executed twice result += c; ? because the result was empty in the beginning.

Fourth: We should also remember,java also execute the main function first, the go to execute
others one by one.

Firth: we should shut down the Scanner when we finished.
 */


