import java.util.*;
public class JavaExercise {

    /**
     * Returns an array [1, 2, 3, 4, 5, 6]
     */
    public static int[] makeDice() {
        int[] numbers = new int[6];
        int[] array = {1, 2, 3, 4, 5, 6};
        // TODO: Fill in this function.
        return array;
    }

    /**
     * Returns the order depending on the customer.
     * If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     * If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     * In any other case, return an empty String[] of size 3.
     */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        if (customer.equals("Ergun")) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if (customer.equals("Erik")) {
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        } else {
            return new String[3];

        }
    }

    /**
     * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] array) {
        int m1 = array[0];
        int n1 = array[0];
        int p;
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < m1) {
                m1 = array[i];
                idx1 = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > n1) {
                n1 = array[j];
                idx2 = j;
            }
        }
        // TODO: Fill in this function.
        return n1 - m1;
    }

    /**
     * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
     * Hailstone sequence is described as:
     * - Pick a positive integer n as the start
     * - If n is even, divide n by 2
     * - If n is odd, multiply n by 3 and add 1
     * - Continue this process until n is 1
     */
    public static List<Integer> hailstone(int n) {
       return hailstoneHelper(n, new ArrayList<>());
    }
    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
       list.add(x);
       if (x == 1){
           return list;
       }

       int next = (x % 2 == 0) ? x / 2 : 3 * x + 1;
        //这行用了一个三元运算符 (条件) ? 结果1 : 结果2。
        // 如果 x 除以 2 余数是 0（偶数），那么 next 就是 x / 2。
        //否则（奇数），next 就是 3 * x + 1
       return hailstoneHelper(next, list);
        //注意：这里不是简单的调用，而是把算出来的下一个数和同一个账本传给了“下一个自己”。
        //为什么用 return？ 因为你要等待下一辈算完后把最终的账本传回来，
        // 然后你再传给你的上一辈。这就像一个链条，最后一个人把东西传给倒数第二个人，一直传回给第一个发起人。
// TODO: Fill in this function.
    }


public static void main(String[]args) {
    int[] numbers = {12, 9, 2, 23, 98, 13};
    System.out.println("最大值和最小值的差值是：" + findMinMax(numbers));

    }
}
