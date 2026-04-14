public class diamond {
    public static void main(String[] args){
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1;  i < n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
As we can know from this diamond exercise, So what we learned from here? We learned println is totally than
print Because print don't change the line when it finished printing, but println changes the line when it finished
printing, So we should use print if we wanted to print something on the same syntax line.

Let answer another question, we see we have two syntax lines here, System.out.println(); Why do we need it?
Basically, we need that to end the loop, if we don't do that we will see the consequence like this:

    *
   ***
  *****
 *******
*********
 *******  *****   ***    *

 */
