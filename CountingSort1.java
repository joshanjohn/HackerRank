import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        // Initialize a frequency array with 100 elements
        List<Integer> frequency = new ArrayList<>();
        Set<Integer> uniques = new HashSet<>();
        uniques.addAll(arr);

        int i = 0;
        while (i < 100) {
            frequency.add(0);
            i++;
        }

        for (int value1 : uniques) {
            for (int value2 : arr) {
                if (value1 == value2) {
                    frequency.set(value2, frequency.get(value2) + 1);
                }
            }
        }
        // System.out.println(uniques.toString());
        // System.out.println(frequency.toString());
        return frequency;
    }

}
