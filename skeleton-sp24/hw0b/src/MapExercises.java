import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
         Map<Character, Integer> map = new HashMap<>();
         int i = 1;
         for (char c = 'a'; c <= 'z'; c++){
             map.put(c, i);
             i++;

         }
        // TODO: Fill in this function.
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> Squares(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, n*n);
        }
        // TODO: Fill in this function.
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> counts = new HashMap<>();
        for (String w : words){
            if (!counts.containsKey(w)){
                counts.put(w, 1);
            }
            else {
                int oldCount = counts.get(w);
                counts.put(w, oldCount + 1);
            }
        }
        // TODO: Fill in this function.
        return counts;
    }
    public static void main(String[] args){
        System.out.println("Letter Mapping:"  + letterToNum());
        System.out.println("w. Squares:"  + Squares(List.of(1, 3, 5)));
        List<String> wordList = List.of("apple", "banana", "Apple" );
        System.out.println("Word Count:"  + countWords(wordList));
    }
}

