import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long min = 0;
        long max = 0;

        Collections.sort(arr);
        min += arr.get(0);
        min += arr.get(1);
        min += arr.get(2);
        min += arr.get(3);

        Collections.sort(arr, Collections.reverseOrder());

        // System.out.println("descending");

        max += arr.get(0);
        max += arr.get(1);
        max += arr.get(2);
        max += arr.get(3);

        System.out.println(min + " " + max);
    }
}
