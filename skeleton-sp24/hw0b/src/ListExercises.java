import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static java.lang.Long.sum;


public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
          int total = 0;
          for (int n : L){
              total = total + n;
          }

          return total;

        // TODO: Fill in this function.
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (int n : L) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }
        // TODO: Fill in this function.


    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> result = new ArrayList<>();

        for(int num : L1){
            if (L2.contains(num)){
                result.add(num);
            }
        }
        // TODO: Fill in this function.
        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        List<Integer> result = new ArrayList<>();
         int count = 0;
        for (String word : words){
            for (int i = 0; i <word.length(); i++) {
                char currentLetter = word.charAt(i);
                if (word.charAt(i) == c){
                    count++;
                }
            }

        }

        // TODO: Fill in this function.
        return count;
    }

   public static void main(String[] agrs){
    List<Integer> L = List.of(1, 2, 3, 4,5);
    System.out.println("Sum:" + sum(L));
    System.out.println("Evens:" + ListExercises.evens(L));

    List<Integer> L2 = List.of(3, 4 ,5, 6);
    System.out.println("Common:" + ListExercises.common(L,L2));

    List<String> words = List.of("Apple", "Banana", "cherry","class");
    System.out.println("Count of 'c':" + ListExercises.countOccurrencesOfC(words,'c'));

    }
}
