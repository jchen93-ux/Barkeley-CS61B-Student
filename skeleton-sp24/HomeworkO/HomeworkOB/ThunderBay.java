package HomeworkOB;

public class ThunderBay {
    public static int findMinIndex(int[] numbers) {
        int m = numbers[0];//将m设置成为数组的第一个数字，方便后面来进行对比
        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < m) {
                m = numbers[i];//如果找到更小的i，就更新m
                idx = i;//数组下标
            }
        }
        return idx;
    }


    public static void main(String[] args) {
         int[]  myNumbers = {10, 5, 8, 3, 12};
         int minIdx = findMinIndex(myNumbers);

         System.out.println("数组中最小的下标是：" +  minIdx);
         System.out.println("对应的最小值数组是：" + myNumbers[minIdx]);

    }
}
